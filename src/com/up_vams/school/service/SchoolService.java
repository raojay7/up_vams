package com.up_vams.school.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.school.entity.School;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

import java.util.List;

/**
 * Created by 隽 on 2017/4/6.
 */
public interface SchoolService extends BaseService<School>
{
    int saveSchoolAndPhoto(SchoolPhoto schoolPhoto);

    List<SchoolPhoto> findSchoolPhotoBySchoolId(String schoolId);

    List<School> findHomeSchool();

    List<SchoolPhoto> findSchoolPhotoByPage(Page<SchoolPhoto> page);

    Long getPhotoTotalRecord(String schoolId);
}
