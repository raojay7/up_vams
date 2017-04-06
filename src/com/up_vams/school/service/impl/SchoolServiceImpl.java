package com.up_vams.school.service.impl;

import com.up_vams.school.dao.SchoolMapper;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.utils.ChineseToEnglish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by 隽 on 2017/4/6.
 */
@Service("schoolService")
public class SchoolServiceImpl implements SchoolService
{
    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public int insert(School entity)
    {
        if (StringUtils.isEmpty(entity.getSchoolName()))
        {
            String pinyin = ChineseToEnglish.getPingYin(entity.getSchoolName());
            String pinyinHeader = ChineseToEnglish.getPinYinHeadChar(entity.getSchoolName());
            entity.setSchoolPinyin(entity.getSchoolPinyin());
            entity.setSchoolPinyinHeader(entity.getSchoolPinyinHeader());
        }
        return schoolMapper.insert(entity);
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

    @Override
    public int saveSchoolAndPhoto(String schoolId, String photoId)
    {

        return 0;
    }
}
