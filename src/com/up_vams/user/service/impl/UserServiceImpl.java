package com.up_vams.user.service.impl;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userSchool.entity.UserSchool;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/3/29.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService
{

    @Override
    public List<UserPhoto> findUserPhotoByUserPhotoPage(Page<UserPhoto> page)
    {
        return userPhotoMapper.selectPageList(page);
    }

    @Override
    public List<UserSchool> findUserPhotoByUserSchoolPage(Page<UserSchool> page)
    {
        return userSchoolMapper.selectPageList(page);
    }
}
