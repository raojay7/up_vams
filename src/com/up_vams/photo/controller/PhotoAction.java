package com.up_vams.photo.controller;

import com.up_vams.photo.service.PhotoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 隽 on 2017/4/5.
 */
@Controller
@RequestMapping("/photo")
public class PhotoAction
{
    @Resource
    private PhotoService photoService;



}
