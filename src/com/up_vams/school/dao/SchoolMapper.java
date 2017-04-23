package com.up_vams.school.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.school.entity.School;
import com.up_vams.userSchool.entity.UserSchool;

import java.util.List;

public interface SchoolMapper extends BaseMapper<School> {

    /**
     * 首页查询学校列表
     * @return
     */
    List<School> selectSchools();

    /**
     * 通过userschool集合查询学校列表
     * @param list
     * @return 学校列表
     */
    List<School> selectSchoolsByUser(List<UserSchool> list);

    /**
     * 根据图片id查到学校的所有
     * @param photoId
     * @return
     */
    School selectSchoolByPhotoId(String photoId);



}