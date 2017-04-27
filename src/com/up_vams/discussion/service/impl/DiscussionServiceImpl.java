package com.up_vams.discussion.service.impl;

import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.discussion.dao.DiscussionMapper;
import com.up_vams.discussion.entity.Discussion;
import com.up_vams.discussion.service.DiscussionService;
import com.up_vams.photoDiscussion.entity.PhotoDiscussion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/4/23.
 */
@Service("discussionService")
public class DiscussionServiceImpl extends BaseServiceImpl<Discussion> implements DiscussionService
{


    @Override
    public List<Discussion> selectDiscussions(List<PhotoDiscussion> list)
    {
        return discussionMapper.selectDisList(list);
    }
}
