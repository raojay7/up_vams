package com.up_vams.user.controller;

import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userPhoto.service.UserPhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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


    //页面跳转逻辑
    @RequestMapping("loginUI")
    public String toLoginUI()
    {
        return "user_login";
    }

    @RequestMapping("photoUI")
    public String toPhotoUI()
    {
        return "user_photo";
    }

    @RequestMapping("schoolUI")
    public String toSchoolUI()
    {
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
    public String register(User user,String password1)
    {
        if (!StringUtils.isEmpty(user))
        {
            userService.insert(user);
        }
        return "redirect:/home/index.do";
    }

    @RequestMapping("login")
    public String login(User user,HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            User user1 = userService.select(user);
            if (user1!=null)
            {
                httpSession.setAttribute("user",user1);
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
    public String update(User user,HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            userService.update(user);
            User user1 = userService.selectByPK(user.getUserId());
            httpSession.setAttribute("user",user1);
        }
        return "redirect:/user/profileUI.do";
    }

    @RequestMapping("/photo/vote")
    public String photo_vote(String photoId,HttpSession httpSession)
    {
        //点赞的实现
        User user = (User)httpSession.getAttribute("user");
        //1更改userphoto的状态和新增关系
        UserPhoto userPhoto=new UserPhoto(user.getUserId(),photoId);
        userPhoto.setUpState(1);
        int insert = userPhotoService.insert(userPhoto);
        //2判断是否插入成功，成就设置到session中
        if (insert>=0)
        {
            httpSession.setAttribute("userPhoto",userPhoto);
        }
        //3更新photo的likenum数目
        Photo photo = photoService.selectByPK(photoId);
        if (photo.getPhotoLikeNum()==null)
        {
            photo.setPhotoLikeNum(0);
        }
        photo.setPhotoLikeNum(photo.getPhotoLikeNum()+1);
        photoService.update(photo);


        return "school_photo_detail";
    }

    @RequestMapping("/photo/vote/cancel")
    public String photo_vote_cancel(String photoId,HttpSession httpSession)
    {
        //1更新点赞状态
        User user = (User)httpSession.getAttribute("user");
        UserPhoto userPhoto = new UserPhoto(user.getUserId(), photoId);
        userPhoto.setUpState(0);

        int update = userPhotoService.update(userPhoto);

        if (update>=0)
        {
            httpSession.setAttribute("userPhoto", userPhoto);
        }

        //2更新photo的likenum数目
        Photo photo = photoService.selectByPK(photoId);
        photo.setPhotoLikeNum(photo.getPhotoLikeNum()-1);
        photoService.update(photo);
        return "school_photo_detail";
    }


}
