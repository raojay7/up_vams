package com.up_vams.school.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.school.entity.School;

import java.util.List;

public interface SchoolMapper extends BaseMapper<School> {

    /**
     * 首页查询学校列表
     * @return
     */
    List<School> selectSchools();

    /**
     *
     */



}