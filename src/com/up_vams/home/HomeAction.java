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
            List<Photo> photos = photoService.selectPageList(list);
            //修改图片的key
            for (Photo photo1:
                photos)
            {
                //将key设置到name中///////
                String originalFilename=photo1.getPhotoName();
                String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
                photo1.setPhotoName(photo1.getPhotoId()+suffix);
                /////////////////////////
            }
            s.setPhotos(photos);
            s.setPhoto(photos.get(0));
        }
        Page<School> p=new Page<School>();
        p.setList(homeSchool);
        m.addAttribute("page",p);
        return "index";
    }
}
