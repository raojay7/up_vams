package com.up_vams.core.service;

import java.util.List;

/**
 * Created by 隽 on 2017/3/30.
 */
public interface BaseService<T>
{
    //添加单个对象
    int insert (T entity);

    //修改单个对象
    int update(T entity);

    //删除单个对象
    int delete(T entity);

    //查询单个对象
    T select(T entity);

    //模糊查询多个对象
    List<T> select(String keyword);

    //查询所有对象
    List<T> select();

    //根据id查找对象
    T selectByPK(String pk);

    //分页查询


}
