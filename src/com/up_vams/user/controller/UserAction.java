package com.up_vams.user.controller;

import com.up_vams.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 隽 on 2017/3/28.
 */
@Controller
@RequestMapping("/user")
public class UserAction
{
    @Resource
    private UserService userService;


    //页面跳转逻辑
    @RequestMapping("loginUI")
    public String toLoginUI()
    {
        return "user_login";
    }

    @RequestMapping("photoUI")
    public String toPhotoUI()
    {
        return "user_photo";
    }

    @RequestMapping("schoolUI")
    public String toSchoolUI()
    {
        return "user_school";
    }


    @RequestMapping("profileUI")
    public String toProfileUI()
    {
        return "user_profile";
    }

    @RequestMapping("friendUI")
    public String toFriendUI()
    {
        return "user_friend";
    }

    @RequestMapping("friend/recommendUI")
    public String toFriendRecommendUI()
    {
        return "user_friend_recommend";
    }

    @RequestMapping("registerUI")
    public String toRegisterUI()
    {
        return "user_register";
    }

    //注册
    @RequestMapping("register")
    public String register(String password1)
    {
        if (password==password1)
        {
            userService.register();
        }
        return "redirect:/home/index";
    }



}
