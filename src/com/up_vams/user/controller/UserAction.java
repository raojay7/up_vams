package com.up_vams.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 隽 on 2017/3/28.
 */
@Controller
@RequestMapping("/user")
public class UserAction
{
    @RequestMapping("index")
    public String toIndex()
    {
        return "index";
    }

}
