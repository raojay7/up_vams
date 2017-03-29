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

    //页面跳转逻辑
    @RequestMapping("login")
    public String toLoginUI()
    {
        return "user_login";
    }

    @RequestMapping("photo")
    public String toPhotoUI()
    {
        return "user_photo";
    }

    @RequestMapping("school")
    public String toSchoolUI()
    {
        return "user_school";
    }


    @RequestMapping("profile")
    public String toProfileUI()
    {
        return "user_profile";
    }

    @RequestMapping("friend")
    public String toFriendUI()
    {
        return "user_friend";
    }

    @RequestMapping("friend/recommend")
    public String toFriendRecommendUI()
    {
        return "user_friend_recommend";
    }

    @RequestMapping("register")
    public String toRegisterUI()
    {
        return "user_register";
    }
}
