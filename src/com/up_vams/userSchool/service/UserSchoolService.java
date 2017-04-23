package com.up_vams.userSchool.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.userSchool.entity.UserSchool;

import java.util.List;

/**
 * Created by 隽 on 2017/4/22.
 */
public interface UserSchoolService extends BaseService<UserSchool>
{
    /**
     * 根据已经封装好的page查询userschool
     * 真正有用的数据：
     * pageNum, 8, totalRecord，userid
     * @param page
     * @return 8条userschool数据
     */
    List<UserSchool> findUserPhotoByUserSchoolPage(Page<UserSchool> page);
}
