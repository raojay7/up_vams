package com.up_vams.school.controller;

import com.up_vams.core.entity.Page;
import com.up_vams.discussion.entity.Discussion;
import com.up_vams.discussion.service.DiscussionService;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.photoDiscussion.entity.PhotoDiscussion;
import com.up_vams.photoDiscussion.service.PhotoDiscussionService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.user.entity.User;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userPhoto.service.UserPhotoService;
import com.up_vams.userSchool.entity.UserSchool;
import com.up_vams.userSchool.service.UserSchoolService;
import com.up_vams.utils.OssUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
@Controller
@RequestMapping("/school")
public class SchoolAction
{

    //注入service
    @Resource
    private SchoolService schoolService;

    @Resource
    private PhotoService photoService;

    @Resource
    private UserPhotoService userPhotoService;

    @Resource
    private UserSchoolService userSchoolService;

    @Resource
    private DiscussionService discussionService;

    @Resource
    private PhotoDiscussionService photoDiscussionService;

    //跳转uri
    @RequestMapping("searchUI")
    public String searchUI()
    {
        return "search_school";
    }

    @RequestMapping("index")
    public String indexUI()
    {
        return "school_index";
    }

    @RequestMapping("createSchoolUI")
    public String createSchoolUI()
    {
        return "create_school";
    }

    /**
     * 根据学校id查询关联的图片
     * 在根据图片的id查图片
     * 在封装学校图片表到page里面传入就可以
     * 可以将一些基本属性放在session中暂存
     *
     * @return
     */
    @RequestMapping("photo/libraryUI")
    public String photo_libraryUI(HttpSession session, Integer pageNum)
    {

        //通过pageresult传入了当前页数
        School school = (School)session.getAttribute("school");
        if (pageNum == null)
        {
            pageNum = 1;
        }
        Long totalRecord = schoolService.getPhotoTotalRecord(school.getSchoolId());
        Page<SchoolPhoto> page = new Page<SchoolPhoto>(pageNum, 8, totalRecord, null);
        page.setId(school.getSchoolId());
        //通过已有的参数查了8条schoolphoto数据放在list中
        List<SchoolPhoto> list = schoolService.findSchoolPhotoByPage(page);
        //再将用户学校表的8条数据放在page中，以便能够通过图片id查8张图片
        List<Photo> photos = photoService.selectPhotos(list);

        //设置一些基本的属性
        Page<Photo> pageResult = new Page<>();
        pageResult.setPageNum(pageNum);
        pageResult.setTotalRecord(totalRecord);
        pageResult.setTotalPage(page.getTotalPage());
        //此时就已经分页了
        pageResult.setList(photos);
        session.setAttribute("pageResult", pageResult);
        return "school_photo_library";
    }

    @RequestMapping("corridor_3dvisitUI")
    public String corridor_3dvisitUI()
    {
        return "school_corridor_3dvisit";
    }

    @RequestMapping("more_prjUI")
    public String more_prjUI()
    {
        return "more_prj";
    }

    @RequestMapping("fly_3dvisitUI")
    public String fly_3dvisitUI()
    {
        return "school_fly_3dvisit";
    }

    @RequestMapping("bigban_visitUI")
    public String bigbanVisitUI()
    {
        return "school_bigban_visit";
    }

    @RequestMapping("photo/uploadUI")
    public String photoUploadUI()
    {
        return "school_photo_upload";
    }

    @RequestMapping("photo/detail")
    public String photoDetailUI(String photoId, HttpSession httpSession,Integer pageNum)
    {
        Photo photo = photoService.selectByPK(photoId);
        httpSession.setAttribute("detail_photo", photo);
        User user = (User)httpSession.getAttribute("user");
        UserPhoto userPhoto = new UserPhoto(user.getUserId(), photoId);
        UserPhoto upResult = userPhotoService.select(userPhoto);
        httpSession.setAttribute("userPhoto", upResult);
        //为了防止跳转错误，更新下学校的session
        //根据图片查学校
        School school = schoolService.selectSchoolByPhotoId(photoId);
        httpSession.setAttribute("school",school);
        List<SchoolPhoto> list = schoolService.findSchoolPhotoBySchoolId(school.getSchoolId());
        if (list != null)
        {
            SchoolPhoto s = list.get(0);//得到一个学校图片实体
            Photo p = photoService.selectSchoolMore(s.getPhotoId());
            httpSession.setAttribute("homePhoto", p);
        }
        //加入用户学校的关系
        UserSchool us=new UserSchool(user.getUserId(),school.getSchoolId());
        UserSchool usResult = userSchoolService.select(us);
        httpSession.setAttribute("userSchool", usResult);

        //由于在图片细节页面显示了评论信息，所以同时应该在该页面加入分页信息
        //通过pageresult传入了当前页数
        if (pageNum == null)
        {
            pageNum = 1;
        }
        Long totalRecord = discussionService.selectTotalRecord(photoId);
        Page<PhotoDiscussion> page = new Page<PhotoDiscussion>(pageNum, 8, totalRecord, null);
        page.setId(photoId);
        List<PhotoDiscussion> pdList = photoDiscussionService.selectPageList(page);
        List<Discussion> discussions = discussionService.selectDiscussions(pdList);

        //将discussion中的每个创建人绑定
        //设置楼层数
        Integer start=page.getStart()+1;
        for (Discussion discussion:discussions)
        {
            //在评论用户表中查询

            //将查询的结果：评论人信息放在discussion的一个user属性（有他的id，名字）中

            //设置楼层数
            discussion.setDisFloorNum(start++);
        }

        //设置一些基本的属性
        Page<Discussion> pageResult = new Page<>();
        pageResult.setPageNum(pageNum);
        pageResult.setTotalRecord(totalRecord);
        pageResult.setTotalPage(page.getTotalPage());
        //此时就已经分页了
        pageResult.setList(discussions);
        httpSession.setAttribute("pageResult", pageResult);

        return "school_photo_detail";
    }

    /**
     * 新增学校，同时要添加学校和上传人的关系，还要添加学校主页图片和学校的关系
     *
     * @param school
     * @param photo
     * @return
     */
    @RequestMapping("create")
    public String create(School school, Photo photo)
    {
        //1先新增图片
        //此时图片里面有图片id，图片名字，图片的创建人，在service中设置图片的ossname
        int insertOK = photoService.insert(photo);

        if (insertOK < 0)
        {
            return "redirect:/error/insertError.do";
        }
        //2再新增学校,此时有的学校信息只有id名字和简介，在service中在根据名字来设置拼音
        school.setSchoolId(OssUtils.generateKey());
        //有了图片，就将计数置为1
        school.setSchoolPhotoCount(1);
        schoolService.insert(school);

        //3在保存关联关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(school.getSchoolId(), photo.getPhotoId()));
        return "redirect:/home/index.do";
    }

    @RequestMapping("photo/upload")
    public String photo_upload(HttpSession session, Photo photo)
    {
        //1保存图片
        int insertOK = photoService.insert(photo);
        if (insertOK < 0)
        {
            return "redirect:/error/insertError.do";
        }

        School school = (School)session.getAttribute("school");
        //2保存关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(school.getSchoolId(), photo.getPhotoId()));
        school.setSchoolPhotoCount(school.getSchoolPhotoCount() + 1);
        schoolService.update(school);
        return "forward:/school/index.do";
    }

    @RequestMapping("find")
    public String find(String schoolId, HttpSession session)
    {
        //1学校首页显示
        //2得到学校信息
        School school = schoolService.selectByPK(schoolId);
        //3设置到域中
        //先清除原来的school
        session.setAttribute("school", school);
        //4得到学校照片信息
        List<SchoolPhoto> list = schoolService.findSchoolPhotoBySchoolId(schoolId);
        if (list != null)
        {
            SchoolPhoto s = list.get(0);//得到一个学校图片实体
            Photo photo = photoService.selectSchoolMore(s.getPhotoId());
            session.setAttribute("homePhoto", photo);
        }
        //5显示收藏状态
        User user = (User)session.getAttribute("user");
        UserSchool us=new UserSchool(user.getUserId(),schoolId);
        UserSchool result = userSchoolService.select(us);
        session.setAttribute("userSchool", result);
        return "forward:/school/index.do";
    }


    @RequestMapping("photo/getXY")
    public String photo_getXY()
    {
        return "get_xyResult";
    }

    @RequestMapping("photo/get_xyResult")
    public String photo_xyResult(Double latitude, Double longitude, HttpSession session)
    {
        //经纬度数据类型有问题
        session.setAttribute("latitude", latitude);
        session.setAttribute("longitude", longitude);
        return "school_photo_upload";
    }

}
