package com.up_vams.user.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.photo.entity.Photo;
import com.up_vams.user.entity.User;
import com.up_vams.userPhoto.entity.UserPhoto;

import java.util.List;

/**
 * Created by 隽 on 2017/3/29.
 */
public interface UserService extends BaseService<User>
{
    /**
     * 根据已经封装好的page查询userphoto
     * 真正有用的数据：
     * pageNum, 8, totalRecord，userid
     * @param page
     * @return 8条userphoto数据
     */
    List<UserPhoto> findUserPhotoByPage(Page<UserPhoto> page);

    /**
     * 根据8条userphoto数据，来查询对应的photo
     * @param list 前面分页查询到的list
     * @return 得到9条照片数据
     */
    List<Photo> selectPhotosByUser(List<UserPhoto> list);
}
