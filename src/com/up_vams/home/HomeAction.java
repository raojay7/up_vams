package com.up_vams.home;

import com.up_vams.core.entity.Page;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
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

    @RequestMapping("index")
    public String toIndexUI(Model m)
    {
        List<School> homeSchool = schoolService.findHomeSchool();
        Page<School> p=new Page<School>();
        p.setList(homeSchool);
        m.addAttribute("page",p);
        return "index";
    }
}
