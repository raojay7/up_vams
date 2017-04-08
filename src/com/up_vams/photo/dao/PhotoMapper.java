package com.up_vams.photo.dao;


import com.up_vams.core.dao.BaseMapper;
import com.up_vams.core.entity.Page;
import com.up_vams.photo.entity.Photo;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

import java.util.List;

public interface PhotoMapper extends BaseMapper<Photo>{


    /**
     * 学校查看更多，主页照片
     * @param photoId 照片id
     * @return 照片
     */
    Photo selectSchoolMore(String photoId);

    List<Photo> selectPhotos(Page<SchoolPhoto> page);



}