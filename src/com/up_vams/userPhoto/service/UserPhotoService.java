package com.up_vams.userPhoto.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.userPhoto.entity.UserPhoto;

import java.util.List;

/**
 * Created by 隽 on 2017/4/21.
 */
public interface UserPhotoService extends BaseService<UserPhoto>
{
    /**
     * select（）
     * 他的select方法应该传入封装好的userphoto
     * 返回userphoto的所有字段
     */

    /**
     * 根据已经封装好的page查询userphoto
     * 真正有用的数据：
     * pageNum, 8, totalRecord，userid
     * @param page
     * @return 8条userphoto数据
     */
    List<UserPhoto> findUserPhotoByUserPhotoPage(Page<UserPhoto> page);

}
