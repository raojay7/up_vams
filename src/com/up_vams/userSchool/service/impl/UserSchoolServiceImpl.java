package com.up_vams.userSchool.service.impl;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.userSchool.entity.UserSchool;
import com.up_vams.userSchool.service.UserSchoolService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/4/22.
 */
@Service("userSchoolService")
public class UserSchoolServiceImpl extends BaseServiceImpl<UserSchool> implements UserSchoolService
{
    @Override
    public List<UserSchool> findUserPhotoByUserSchoolPage(Page<UserSchool> page)
    {
        return userSchoolMapper.selectPageList(page);
    }
}
