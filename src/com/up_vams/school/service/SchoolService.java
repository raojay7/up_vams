package com.up_vams.school.service;

import com.up_vams.core.service.BaseService;
import com.up_vams.school.entity.School;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;

/**
 * Created by 隽 on 2017/4/6.
 */
public interface SchoolService extends BaseService<School>
{
    int saveSchoolAndPhoto(SchoolPhoto schoolPhoto);
}
