package com.up_vams.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 隽 on 2017/4/5.
 */
@Controller
@RequestMapping("/school")
public class SchoolAction
{
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

    @RequestMapping("photo/library")
    public String photo_libraryUI()
    {
        return "school_photo_library";
    }
    @RequestMapping("corridor_3dvisit")
    public String corridor_3dvisitUI()
    {
        return "school_corridor_3dvisit";
    }
    @RequestMapping("more_prj")
    public String more_prjUI()
    {
        return "more_prj";
    }


    @RequestMapping("fly_3dvisit")
    public String fly_3dvisitUI()
    {
        return "school_fly_3dvisit";
    }


    @RequestMapping("bigban_visit")
    public String bigbanVisitUI()
    {
        return "school_bigban_visit";
    }
    @RequestMapping("photo/upload")
    public String photoUploadUI()
    {
        return "school_photo_upload";
    }

}
