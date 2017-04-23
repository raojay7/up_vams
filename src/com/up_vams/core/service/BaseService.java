package com.up_vams.core.service;

import com.up_vams.core.entity.Page;

import java.util.List;

/**
 * Created by 隽 on 2017/3/30.
 */
public interface BaseService<T>
{
    /**
     * 新增一个对象
     * @param t 对应的实体
     * @return 影响的行数
     */
    int insert(T t);

    /**
     * 删除一个对象
     * @param t  对应的实体
     * @return 影响的行数
     */
    int delete(T t);

    /**
     * 根据一个实体的某个部分查找对应全部的实体，如用户的登陆通过email和password查找
     * @param t 含有部分字段的new出来的实体
     * @return 找到的实体
     */
    T select(T t);

    /**
     * 根据主键查询对应的实体
     * @param pk 一般是uuid
     * @return 找到的实体
     */
    T selectByPK(String pk);

    /**
     * 更新数据库中实体的内容
     * @param t 要更新的字段，如果其他为null就不修改
     * @return 影响的行数
     */
    int update(T t);

    /**
     * 根据关键字查询
     * @param keyword 可以是名字
     * @return 找到的实体集合
     */
    List<T> selectList(String keyword);

    /**
     * 找到所有的实体
     * @return 找到的实体集合
     */
    List<T> selectAll();

    /**
     * 分页动态查询数据列表可通过id，开始行号，一面显示多少个
     * @param page 封装好的page对象
     * @return 关联的实体
     */
    List<T> selectPageList(Page<T> page);

    /**
     * 用于关联表，如userphoto表，通过user的id查找对应表中有多少数据
     * 动态查询总记录数
     * @param id 关联表主体的id
     * @return 表中的数据数
     */
    Long selectTotalRecord(String id);

}
