package com.up_vams.photo.service.impl;

import com.up_vams.photo.dao.PhotoMapper;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
@Service("photoService")
public class PhotoServiceImpl implements PhotoService
{
    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public int insert(Photo entity)
    {
        return 0;
    }

    @Override
    public int update(Photo entity)
    {
        return 0;
    }

    @Override
    public int delete(Photo entity)
    {
        return 0;
    }

    @Override
    public Photo select(Photo entity)
    {
        return null;
    }

    @Override
    public List<Photo> select(String keyword)
    {
        return null;
    }

    @Override
    public List<Photo> select()
    {
        return null;
    }

    @Override
    public Photo selectByPK(String pk)
    {
        return null;
    }
}
