package com.up_vams.photo.service.impl;

import com.up_vams.core.service.impl.BaseServiceImpl;
import com.up_vams.photo.entity.Photo;
import com.up_vams.photo.service.PhotoService;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by 隽 on 2017/4/5.
 */
@Service("photoService")
public class PhotoServiceImpl extends BaseServiceImpl<Photo> implements PhotoService
{


    @Override
    public int insert(Photo entity)
    {
        //如果为空不让他加
        if (StringUtils.isEmpty(entity.getPhotoId())|StringUtils.isEmpty(entity.getPhotoName()))
        {
            return -1;
        }
        //将key设置到name中///////
        String originalFilename=entity.getPhotoName();
        //如果文件上传不成功可能会出错
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        entity.setPhotoOssname(entity.getPhotoId()+suffix);
        return photoMapper.insert(entity);
    }



    @Override
    public Photo selectSchoolMore(String photoId)
    {
        return photoMapper.selectSchoolMore(photoId);
    }

    @Override
    public List<Photo> selectPageList(List<SchoolPhoto> list)
    {
        return photoMapper.selectPhotos(list);
    }

}
