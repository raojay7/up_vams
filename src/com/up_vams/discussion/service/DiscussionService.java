package com.up_vams.discussion.service;

import com.up_vams.core.service.BaseService;
import com.up_vams.discussion.entity.Discussion;
import com.up_vams.photoDiscussion.entity.PhotoDiscussion;

import java.util.List;

/**
 * Created by 隽 on 2017/4/23.
 */
public interface DiscussionService extends BaseService<Discussion>
{
    /**
     * 通过PhotoDiscussion查到discussion
     * @param list 封装好的关联表，此时只有八条数据
     * @return 对应查出8个discussion数据
     * 如果要使用分页还应该自己封装：
     *  Page<Photo> pageResult=new Page<>();
    pageResult.setPageNum(pageNum);
    pageResult.setTotalRecord(totalRecord);
    pageResult.setTotalPage(page.getTotalPage());
    pageResult.setList(photos);
     */
    List<Discussion> selectDiscussions(List<PhotoDiscussion> list);
}
