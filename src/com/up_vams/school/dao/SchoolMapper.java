package com.up_vams.school.dao;

import com.up_vams.core.dao.BaseMapper;
import com.up_vams.core.entity.Page;
import com.up_vams.school.entity.School;

public interface SchoolMapper extends BaseMapper<School> {

    /**
     * 首页查询学校列表
     * @return
     */
    Page<School> selectSchools();

    /**
     *
     */



}