package com.up_vams.school.controller;

import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.utils.OssUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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

    @RequestMapping("photo/libraryUI")
    public String photo_libraryUI()
    {
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

    /**
     * 新增学校，同时要添加学校和上传人的关系，还要添加学校主页图片和学校的关系
     * @param school
     * @param photo
     * @return
     */
    @RequestMapping("create")
    public String create(School school,Photo photo)
    {
        //1先新增图片
        //此时图片里面有图片id，图片名字，图片的创建人
        photoService.insert(photo);
        //2再新增学校,此时有的学校信息只有id名字和简介，在service中在根据名字来设置拼音
        school.setSchoolId(OssUtils.generateKey());
        schoolService.insert(school);
        //3在保存关联关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(school.getSchoolId(),photo.getPhotoId()));
        return "redirect:/home/index.do";
    }

    @RequestMapping("photo/upload")
    public String photo_upload(String schoolId,Photo photo)
    {

        return "redirect:/home/index.do";
    }


}
