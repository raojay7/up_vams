package com.up_vams.school.service.impl;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.school.entity.School;
import com.up_vams.school.service.SchoolService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.utils.ChineseToEnglish;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by 隽 on 2017/4/6.
 */
@Service("schoolService")
public class SchoolServiceImpl extends BaseServiceImpl<School> implements SchoolService
{


    @Override
    public int insert(School entity)
    {

        if (!StringUtils.isEmpty(entity.getSchoolName()))
        {
            String pinyin = ChineseToEnglish.getPingYin(entity.getSchoolName());
            String pinyinHeader = ChineseToEnglish.getPinYinHeadChar(entity.getSchoolName());
            entity.setSchoolPinyin(pinyin);
            entity.setSchoolPinyinHeader(pinyinHeader);
        }
        return schoolMapper.insert(entity);
    }



    @Override
    public int saveSchoolAndPhoto(SchoolPhoto schoolPhoto)
    {
        return schoolPhotoMapper.insert(schoolPhoto);
    }

    @Override
    public List<SchoolPhoto> findSchoolPhotoBySchoolId(String schoolId)
    {
        return schoolPhotoMapper.selectPhotos(schoolId);
    }

    @Override
    public List<School> findHomeSchool()
    {
        return schoolMapper.selectSchools();
    }

    @Override
    public List<SchoolPhoto> findSchoolPhotoByPage(Page<SchoolPhoto> page)
    {
        return schoolPhotoMapper.selectPageList(page);
    }

    @Override
    public Long getPhotoTotalRecord(String schoolId)
    {
        return schoolPhotoMapper.selectTotalRecord(schoolId);
    }

}
