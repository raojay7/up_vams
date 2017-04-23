package com.up_vams.userPhoto.service.impl;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userPhoto.service.UserPhotoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/4/21.
 */
@Service("userPhotoService")
public class UserPhotoServiceImpl extends BaseServiceImpl<UserPhoto> implements UserPhotoService
{

    @Override
    public List<UserPhoto> findUserPhotoByUserPhotoPage(Page<UserPhoto> page)
    {
        return userPhotoMapper.selectPageList(page);
    }
}
