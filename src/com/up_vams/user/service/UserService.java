package com.up_vams.user.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.user.entity.User;
import com.up_vams.userPhoto.entity.UserPhoto;
import com.up_vams.userSchool.entity.UserSchool;

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
    List<UserPhoto> findUserPhotoByUserPhotoPage(Page<UserPhoto> page);

    /**
     * 根据已经封装好的page查询userschool
     * 真正有用的数据：
     * pageNum, 8, totalRecord，userid
     * @param page
     * @return 8条userschool数据
     */
    List<UserSchool> findUserPhotoByUserSchoolPage(Page<UserSchool> page);
    //还差个查询总记录数

}
