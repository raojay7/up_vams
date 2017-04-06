package com.up_vams.school.service.impl;

import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/4/6.
 */
@Service("schoolService")
public class SchoolServiceImol implements SchoolService
{
    @Override
    public int insert(School entity)
    {
        return 0;
    }

    @Override
    public int update(School entity)
    {
        return 0;
    }

    @Override
    public int delete(School entity)
    {
        return 0;
    }

    @Override
    public School select(School entity)
    {
        return null;
    }

    @Override
    public List<School> select(String keyword)
    {
        return null;
    }

    @Override
    public List<School> select()
    {
        return null;
    }

    @Override
    public School selectByPK(String pk)
    {
        return null;
    }
}
