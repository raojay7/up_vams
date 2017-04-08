package com.up_vams.photo.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.photo.entity.Photo;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
public interface PhotoService extends BaseService<Photo>
{
    Photo selectSchoolMore(String photoId);
    List<Photo> selectPageList(Page<SchoolPhoto> page);
}
