package com.up_vams.userDiscussion.service;

import com.up_vams.core.service.BaseService;
import com.up_vams.user.entity.User;
import com.up_vams.userDiscussion.entity.UserDiscussion;

/**
 * Created by 隽 on 2017/4/27.
 */
public interface UserDiscussionService extends BaseService<UserDiscussion>
{
    /**
     * 通过评论的id查对应的创建人
     * @param discussionId
     * @return 创建人
     */
    User selectUserByDiscussion(String discussionId);
}
