package com.up_vams.userDiscussion.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.user.entity.User;

/**
 * Created by wzw on 2017/4/27 0027.
 */
public interface UserDiscussionMapper extends BaseMapper {

    User selectUserByDiscussion(String discussionId);
}
