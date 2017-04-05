package com.up_vams.photo.controller;

import com.up_vams.photo.service.PhotoService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by 隽 on 2017/4/5.
 */
@Controller
public class PhotoAction
{
    @Resource
    private PhotoService photoService;


}
