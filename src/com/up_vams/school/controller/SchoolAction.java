package com.up_vams.school.controller;

import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.utils.OssUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
     * @return
     */
    @RequestMapping("photo/libraryUI")
    public String photo_libraryUI(HttpSession session)
    {
        School school = (School)session.getAttribute("school");
        List<SchoolPhoto> list = schoolService.findSchoolPhotoBySchoolId(school.getSchoolId());
        Page<SchoolPhoto> page=new Page<>();
        page.setList(list);
        photoService.

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
    public String photoDetailUI()
    {
        return "school_photo_detail";
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
        //1保存图片
        photoService.insert(photo);
        //2保存关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(schoolId,photo.getPhotoId()));
        return "forward:/school/index.do";
    }


    @RequestMapping("find")
    public String find(String schoolId,HttpSession session)
    {
        //1学校首页显示
        //2得到学校信息
        School school = schoolService.selectByPK(schoolId);
        //3设置到域中
        session.setAttribute("school",school);
        //4得到学校照片信息
        List<SchoolPhoto> list = schoolService.findSchoolPhotoBySchoolId(schoolId);
        if (list!=null)
        {
            SchoolPhoto s=list.get(0);//得到一个学校图片实体
            Photo photo = photoService.selectSchoolMore(s.getPhotoId());
            //将key设置到name中///////
            String originalFilename=photo.getPhotoName();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            photo.setPhotoName(photo.getPhotoId()+suffix);
            /////////////////////////
            session.setAttribute("homePhoto",photo);
        }

        return "forward:/school/index.do";
    }




    @RequestMapping("showPhotoDetail")
    public String showPhotoDetail(String photoId,Model model)
    {
        return "school_photo_detail";
    }


}
