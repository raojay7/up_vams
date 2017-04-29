package com.up_vams.photo.controller;

import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
@Controller
@RequestMapping("/photo")
public class PhotoAction
{
    @Resource
    private PhotoService photoService;

    private SchoolService schoolService;

    //3d暂时完成不了
    @RequestMapping("to3dfloor")
    public String to3dfloor(HttpSession session)
    {
        //显示图片信息
        //其实这个pageresult应该分别写
        Object srcPageResult = session.getAttribute("pageResult");
        if (srcPageResult==null)
        {
            School school = (School)session.getAttribute("school");
            Long totalRecord = schoolService.getPhotoTotalRecord(school.getSchoolId());
            //默认查第二页
            Page<SchoolPhoto> page = new Page<SchoolPhoto>(2, 8, totalRecord, null);
            page.setId(school.getSchoolId());
            //通过已有的参数查了8条schoolphoto数据放在list中
            List<SchoolPhoto> list = schoolService.findSchoolPhotoByPage(page);
            //再将用户学校表的8条数据放在page中，以便能够通过图片id查8张图片
            List<Photo> photos = photoService.selectPhotos(list);

            //设置一些基本的属性
            Page<Photo> pageResult = new Page<>();
            pageResult.setPageNum(1);
            pageResult.setTotalRecord(totalRecord);
            pageResult.setTotalPage(page.getTotalPage());
            //此时就已经分页了
            pageResult.setList(photos);
            session.setAttribute("pageResult", pageResult);
        }
        return "lobby";
    }


}
