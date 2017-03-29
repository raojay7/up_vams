package com.up_vams.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 隽 on 2017/3/29.
 */
@Controller
@RequestMapping("/home")
public class HomeAction
{
    @RequestMapping("index")
    public String toIndexUI()
    {
        return "index";
    }
}
