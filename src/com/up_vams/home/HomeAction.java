package com.up_vams.home;

import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 隽 on 2017/3/29.
 */
@Controller
@RequestMapping("/home")
public class HomeAction
{
    @Resource
    private SchoolService schoolService;

    @Resource
    private PhotoService photoService;
    @RequestMapping("index")
    public String toIndexUI(Model m)
    {
        List<School> homeSchool = schoolService.findHomeSchool();
        for (School s:
             homeSchool)
        {
            Page<SchoolPhoto> p=new Page<>(1,5,5,null);
            p.setId(s.getSchoolId());
            List<SchoolPhoto> list = schoolService.findSchoolPhotoByPage(p);
            Page<SchoolPhoto> p1=new Page<>();
            p1.setList(list);
            List<Photo> photos = photoService.selectPageList(p1);
            s.setPhotos(photos);
        }
        Page<School> p=new Page<School>();
        p.setList(homeSchool);
        m.addAttribute("page",p);
        return "index";
    }
}
