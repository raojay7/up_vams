package com.up_vams.user.controller;

import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
    public String register(User user,String password1)
    {
        if (!StringUtils.isEmpty(user))
        {
            if (user.getUserPassword().equals(password1))
            {
                userService.insert(user);
            }
        }
        return "redirect:/home/index.do";
    }

    @RequestMapping("login")
    public String login(User user,HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            User user1 = userService.select(user);
            if (user1!=null)
            {
                httpSession.setAttribute("user",user1);
            }
        }
        return "forward:/user/profileUI.do";
    }


    @RequestMapping("update")
    public String update(User user,HttpSession httpSession)
    {
        if (!StringUtils.isEmpty(user))
        {
            userService.update(user);
            httpSession.setAttribute("user",user);
        }
        return "redirect:/user/profileUI.do";
    }






}
