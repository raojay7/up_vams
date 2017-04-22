package com.up_vams.school.controller;

import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
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
     * @return
     */
    @RequestMapping("photo/libraryUI")
    public String photo_libraryUI(HttpSession session,Integer pageNum)
    {

        //通过pageresult传入了当前页数
        School school = (School)session.getAttribute("school");
        if(pageNum==null)
        {
            pageNum=1;
        }
        Long totalRecord=schoolService.getPhotoTotalRecord(school.getSchoolId());
        Page<SchoolPhoto> page=new Page<SchoolPhoto>(pageNum,8,totalRecord,null);
        page.setId(school.getSchoolId());
        //通过已有的参数查了8条schoolphoto数据放在list中
        List<SchoolPhoto> list = schoolService.findSchoolPhotoByPage(page);
        //再将用户学校表的8条数据放在page中，以便能够通过图片id查8张图片
        List<Photo> photos = photoService.selectPageList(list);

        //设置一些基本的属性
        Page<Photo> pageResult=new Page<>();
        pageResult.setPageNum(pageNum);
        pageResult.setTotalRecord(totalRecord);
        pageResult.setTotalPage(page.getTotalPage());
        //此时就已经分页了
        pageResult.setList(photos);
        session.setAttribute("pageResult",pageResult);
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
    public String photoDetailUI(String photoId,HttpSession httpSession)
    {
        Photo photo = photoService.selectByPK(photoId);
        httpSession.setAttribute("detail_photo",photo);
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
        //此时图片里面有图片id，图片名字，图片的创建人，在service中设置图片的ossname
        int insertOK = photoService.insert(photo);

        if (insertOK<0)
        {
            return "redirect:/error/insertError.do";
        }
        //2再新增学校,此时有的学校信息只有id名字和简介，在service中在根据名字来设置拼音
        school.setSchoolId(OssUtils.generateKey());
        //有了图片，就将计数置为1
        school.setSchoolPhotoCount(1);
        schoolService.insert(school);

        //3在保存关联关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(school.getSchoolId(),photo.getPhotoId()));
        return "redirect:/home/index.do";
    }

    @RequestMapping("photo/upload")
    public String photo_upload(HttpSession session,Photo photo)
    {
        //1保存图片
        int insertOK=photoService.insert(photo);
        if (insertOK<0)
        {
            return "redirect:/error/insertError.do";
        }

        School school= (School)session.getAttribute("school");
        //2保存关系
        schoolService.saveSchoolAndPhoto(new SchoolPhoto(school.getSchoolId(),photo.getPhotoId()));
        school.setSchoolPhotoCount(school.getSchoolPhotoCount()+1);
        schoolService.update(school);
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
            session.setAttribute("homePhoto",photo);
        }

        return "forward:/school/index.do";
    }




    @RequestMapping("showPhotoDetail")
    public String showPhotoDetail(String photoId,HttpSession httpSession)
    {
        Photo photo = photoService.selectByPK(photoId);
        //把photo和关系设置到session
        httpSession.setAttribute("detail_photo",photo);
        //根据用户和图片id查询userphoto并设置到session

        //httpSession.setAttribute("userPhoto",userPhoto);
        return "school_photo_detail";
    }



}
