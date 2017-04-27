package com.up_vams.userDiscussion.service.impl;

import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.user.entity.User;
import com.up_vams.userDiscussion.entity.UserDiscussion;
import com.up_vams.userDiscussion.service.UserDiscussionService;
import org.springframework.stereotype.Service;

/**
 * Created by 隽 on 2017/4/27.
 */
@Service("userDiscussionService")
public class UserDiscussionServiceImpl extends BaseServiceImpl<UserDiscussion> implements UserDiscussionService
{

    @Override
    public User selectUserByDiscussion(String discussionId)
    {
        return userDiscussionMapper.selectUserByDiscussion(discussionId);
    }
}
