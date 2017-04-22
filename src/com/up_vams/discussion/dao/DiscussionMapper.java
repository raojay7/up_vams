package com.up_vams.discussion.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.discussion.entity.Discussion;
import com.up_vams.photoDiscussion.entity.PhotoDiscussion;

import java.util.List;

public interface DiscussionMapper extends BaseMapper<Discussion> {

    /**
     * 通过PhotoDicussion列表查评论
     *
     */
    List<Discussion> selectDisList(List<PhotoDiscussion> pds);
}