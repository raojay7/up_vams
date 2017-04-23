package com.up_vams.user.controller;

import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userPhoto.service.UserPhotoService;
import com.up_vams.userSchool.entity.UserSchool;
import com.up_vams.userSchool.service.UserSchoolService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 隽 on 2017/3/28.
 */
@Controller
@RequestMapping("/user")
public class UserAction
{
    
    @Resource
    private UserService userService;

    @Resource
    private UserPhotoService userPhotoService;

    @Resource
    private PhotoService photoService;

    @Resource
    private UserSchoolService userSchoolService;

    @Resource
    private SchoolService schoolService;

    //页面跳转逻辑
    @RequestMapping("loginUI")
    public String toLoginUI()
    {
        return "user_login";
    }

    @RequestMapping("photoUI")
    public String toPhotoUI(HttpSession session, Integer pageNum)
    {

        //通过pageresult传入了当前页数
        User user = (User)session.getAttribute("user");
        if (pageNum == null)
        {
            pageNum = 1;
        }
        Long totalRecord = userPhotoService.selectTotalRecord(user.getUserId());
        if (totalRecord==0)
        {
            return "user_photo";
        }
        Page<UserPhoto> page = new Page<UserPhoto>(pageNum, 8, totalRecord, null);
        page.setId(user.getUserId());
        //通过已有的参数id(userid)查了8条userphoto数据放在list中
        List<UserPhoto> list = userPhotoService.findUserPhotoByUserPhotoPage(page);
        //再将用户学校表的8条数据放在page中，以便能够通过图片id查8张图片
        List<Photo> photos = photoService.selectPhotosByUser(list);

        //设置一些基本的属性
        Page<Photo> pageResult = new Page<>();
        pageResult.setPageNum(pageNum);
        pageResult.setTotalRecord(totalRecord);
        pageResult.setTotalPage(page.getTotalPage());
        //此时就已经分页了
        pageResult.setList(photos);
        session.setAttribute("pageResult", pageResult);
        return "user_photo";
    }

    @RequestMapping("schoolUI")
    public String toSchoolUI(HttpSession session, Integer pageNum)
    {

        if (pageNum == null)
        {
            pageNum = 1;
        }
        //通过pageresult传入了当前页数
        User user = (User)session.getAttribute("user");

        Long totalRecord = userSchoolService.selectTotalRecord(user.getUserId());

        if (totalRecord==0)
        {
            return "user_school";
        }

        Page<UserSchool> page = new Page<UserSchool>(pageNum, 8, totalRecord, null);
        page.setId(user.getUserId());
        //通过已有的参数id(userid)查了8条userphoto数据放在list中
        List<UserSchool> list = userSchoolService.findUserPhotoByUserSchoolPage(page);
        //再将用户学校表的8条数据放在page中，以便能够通过图片id查8张图片
        if (list != null)
        {
            List<School> schools = schoolService.selectSchoolsByUser(list);

            //设置一些基本的属性
            Page<School> pageResult = new Page<>();
            pageResult.setPageNum(pageNum);
            pageResult.setTotalRecord(totalRecord);
            pageResult.setTotalPage(page.getTotalPage());
            for (School school : schools)
            {
                //设置学校主页图片
                List<SchoolPhoto> schoolphotos = schoolService.findSchoolPhotoBySchoolId(school.getSchoolId());
                if (schoolphotos != null)
                {
                    SchoolPhoto s = schoolphotos.get(0);//得到一个学校图片实体
                    Photo photo = photoService.selectSchoolMore(s.getPhotoId());
                    //将图片设置到学校中
                    school.setPhoto(photo);
                }
            }
            //此时就已经分页了,在jsp中要取school中photo
            pageResult.setList(schools);

            session.setAttribute("pageResult", pageResult);
        }
        return "user_school";
    }

    @RequestMapping("profileUI")
    public String toProfileUI()
    {
        return "user_profile";
    }

    @RequestMapping("friendUI")
    public String toFriendUI()
    {
        return "user_friend";
    }

    @RequestMapping("friend/recommendUI")
    public String toFriendRecommendUI()
    {
        return "user_friend_recommend";
    }

    @RequestMapping("registerUI")
    public String toRegisterUI()
    {
        return "user_register";
    }

    //注册
    @RequestMapping("register")
    public String register(User user, String password1)
    {
        if (!StringUtils.isEmpty(user))
        {
            userService.insert(user);
        }
        return "redirect:/home/index.do";
    }

    @RequestMapping("login")
    public String login(User user, HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            User user1 = userService.select(user);
            if (user1 != null)
            {
                httpSession.setAttribute("user", user1);
            }
        }
        return "forward:/user/profileUI.do";
    }

    @RequestMapping("logout")
    public String logout(HttpSession httpSession)
    {
        httpSession.removeAttribute("user");
        return "redirect:/home/index.do";
    }

    @RequestMapping("update")
    public String update(User user, HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            userService.update(user);
            User user1 = userService.selectByPK(user.getUserId());
            httpSession.setAttribute("user", user1);
        }
        return "redirect:/user/profileUI.do";
    }

    @RequestMapping("/photo/vote")
    public String photo_vote(String photoId, HttpSession httpSession)
    {
        //点赞的实现
        User user = (User)httpSession.getAttribute("user");
        //1更改userphoto的状态和新增关系
        UserPhoto userPhoto = new UserPhoto(user.getUserId(), photoId);
        userPhoto.setUpState(1);
        int insert = userPhotoService.insert(userPhoto);
        //2判断是否插入成功，成就设置到session中
        if (insert >= 0)
        {
            httpSession.setAttribute("userPhoto", userPhoto);
        }
        //3更新photo的likenum数目
        Photo photo = photoService.selectByPK(photoId);
        if (photo.getPhotoLikeNum() == null)
        {
            photo.setPhotoLikeNum(0);
        }
        photo.setPhotoLikeNum(photo.getPhotoLikeNum() + 1);
        photoService.update(photo);

        //4重设置photo
        httpSession.setAttribute("detail_photo", photo);
        return "school_photo_detail";
    }

    @RequestMapping("/photo/revote")
    public String photo_revote(String photoId, HttpSession httpSession)
    {
        //重新点赞的实现
        //1更新原来的state
        User user = (User)httpSession.getAttribute("user");
        UserPhoto userPhoto = new UserPhoto(user.getUserId(), photoId);
        userPhoto.setUpState(1);
        //2保存到数据库中
        int update = userPhotoService.update(userPhoto);
        if (update >= 0)
        {
            httpSession.setAttribute("userPhoto", userPhoto);
        }

        //3更新photo的likenum数目
        Photo photo = photoService.selectByPK(photoId);
        if (photo.getPhotoLikeNum() == null)
        {
            photo.setPhotoLikeNum(0);
        }
        photo.setPhotoLikeNum(photo.getPhotoLikeNum() + 1);
        photoService.update(photo);
        //4重设photo
        httpSession.setAttribute("detail_photo", photo);
        return "school_photo_detail";
    }

    @RequestMapping("/photo/vote/cancel")
    public String photo_vote_cancel(String photoId, HttpSession httpSession)
    {
        //1更新点赞状态
        User user = (User)httpSession.getAttribute("user");
        UserPhoto userPhoto = new UserPhoto(user.getUserId(), photoId);
        userPhoto.setUpState(0);

        int update = userPhotoService.update(userPhoto);

        if (update >= 0)
        {
            httpSession.setAttribute("userPhoto", userPhoto);
        }

        //2更新photo的likenum数目
        Photo photo = photoService.selectByPK(photoId);
        Integer likeNum = photo.getPhotoLikeNum();
        if (likeNum == null)
        {
            photo.setPhotoLikeNum(0);
        }
        else
        {
            photo.setPhotoLikeNum(likeNum - 1);
        }
        photoService.update(photo);
        //4重设photo
        httpSession.setAttribute("detail_photo", photo);
        return "school_photo_detail";
    }

    @RequestMapping("/school/collection")
    public String school_collection(String schoolId, HttpSession httpSession)
    {

        //收藏的实现
        User user = (User)httpSession.getAttribute("user");
        //1更改userschool的状态和新增关系
        UserSchool userSchool = new UserSchool(user.getUserId(), schoolId);
        userSchool.setUsState(1);
        int insert = userSchoolService.insert(userSchool);
        //2判断是否插入成功，成就设置到session中
        if (insert >= 0)
        {
            httpSession.setAttribute("userSchool", userSchool);
        }

        return "school_index";
    }

    @RequestMapping("/school/recollection")
    public String school_recollection(String schoolId, HttpSession httpSession)
    {
        //重新收藏的实现
        User user = (User)httpSession.getAttribute("user");
        //1更改userschool的状态和新增关系
        UserSchool userSchool = new UserSchool(user.getUserId(), schoolId);
        userSchool.setUsState(1);
        userSchoolService.update(userSchool);
        //2判断是否插入成功，成就设置到session中

        httpSession.setAttribute("userSchool", userSchool);

        return "school_index";
    }

    @RequestMapping("/school/collection/cancel")
    public String school_collection_cancel(String schoolId, HttpSession httpSession)
    {
        //1更新状态
        User user = (User)httpSession.getAttribute("user");
        UserSchool userSchool = new UserSchool(user.getUserId(), schoolId);
        userSchool.setUsState(0);

        int update = userSchoolService.update(userSchool);

        if (update >= 0)
        {
            httpSession.setAttribute("userSchool", userSchool);
        }
        return "school_index";
    }

}
