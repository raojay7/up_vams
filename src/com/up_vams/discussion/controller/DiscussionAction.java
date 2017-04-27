package com.up_vams.discussion.controller;

import com.up_vams.discussion.entity.Discussion;
import com.up_vams.discussion.service.DiscussionService;
import com.up_vams.photoDiscussion.entity.PhotoDiscussion;
import com.up_vams.photoDiscussion.service.PhotoDiscussionService;
import com.up_vams.userDiscussion.entity.UserDiscussion;
import com.up_vams.userDiscussion.service.UserDiscussionService;
import com.up_vams.utils.OssUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by 隽 on 2017/4/27.
 */
@Controller
@RequestMapping("discussion")
public class DiscussionAction
{
    @Resource
    private DiscussionService discussionService;

    @Resource
    private PhotoDiscussionService photoDiscussionService;


    @Resource
    private UserDiscussionService userDiscussionService;

    @RequestMapping("submission")
    public String submit(Discussion discussion,String photoId,String userId)
    {
        //1保存评论
        discussion.setDiscussionId(OssUtils.generateKey());
        discussionService.insert(discussion);

        //2保存关联关系
        photoDiscussionService.insert(new PhotoDiscussion(photoId,discussion.getDiscussionId()));
        userDiscussionService.insert(new UserDiscussion(userId,discussion.getDiscussionId()));

        //3

        //4保存好后直接跳到第一页
        return "school_photo_detail";
    }


}
