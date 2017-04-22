package com.up_vams.photo.dao;


import com.up_vams.core.dao.BaseMapper;
import com.up_vams.photo.entity.Photo;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.userPhoto.entity.UserPhoto;

import java.util.List;

public interface PhotoMapper extends BaseMapper<Photo>{


    /**
     * 学校查看更多，主页照片
     * @param photoId 照片id
     * @return 照片
     */
    Photo selectSchoolMore(String photoId);

    /**
     * 通过SchoolPhoto列表查询照片
     * @param list
     * @return
     */
    List<Photo> selectPhotos(List<SchoolPhoto> list);


    /**
     * 通过UserPhoto列表查询照片列表
     * @param ups
     * @return
     */
    List<Photo> selectPhotosByUP(List<UserPhoto> ups);

}