package com.up_vams.schoolPhoto.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

import java.util.List;

public interface SchoolPhotoMapper extends BaseMapper<SchoolPhoto>{

    /**
     * 通过学校ID查询照片ID列表
     * @param schoolId 学校ID
     * @return 实体列表
     */
       List<SchoolPhoto> selectPhotos(String schoolId);

 



}