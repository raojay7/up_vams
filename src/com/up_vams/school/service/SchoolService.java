package com.up_vams.school.service;

import com.up_vams.core.entity.Page;
import com.up_vams.core.service.BaseService;
import com.up_vams.school.entity.School;
import com.up_vams.schoolPhoto.entity.SchoolPhoto;
import com.up_vams.userSchool.entity.UserSchool;

import java.util.List;

/**
 * Created by 隽 on 2017/4/6.
 */
public interface SchoolService extends BaseService<School>
{
    /**
     * 保存学习图片表的关联关系
     * @param schoolPhoto 保存到数据库中
     * @return 影响的行数
     */
    int saveSchoolAndPhoto(SchoolPhoto schoolPhoto);

    /**
     * 根据学校的id查到对应的学校图片表
     * @param schoolId 学校id
     * @return 所有学校图片表
     */
    List<SchoolPhoto> findSchoolPhotoBySchoolId(String schoolId);

    /**
     * 查询首页学校，限制查询3个
     * @return 只有3个的school的list
     */
    List<School> findHomeSchool();

    /**
     * 分页查询学校的图片
     * @param page 已经限制了数目的学校图片表，并且封装在了page中，有效的数据有：
     *             当前页数：pageNum
     *             schoolphoto集合：list
     *             学校的id：id
     *             一面显示多少：limit
     *             总记录数：totalRecord
     *             并且自动计算了总页数：setTotalPage
     *
     * @return 查到的8条schoolphoto
     */
    List<SchoolPhoto> findSchoolPhotoByPage(Page<SchoolPhoto> page);

    /**
     * 根据学校的id查询对应图片的总数目
     * @param schoolId
     * @return 学校图片的数目
     */
    Long getPhotoTotalRecord(String schoolId);

    /**
     * 和根据用户查图片一样
     * @param list 什么鬼
     * @return
     */
    List<School> selectSchoolsByUser(List<UserSchool> list);
}
