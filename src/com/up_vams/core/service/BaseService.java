package com.up_vams.core.service;

import java.util.List;

/**
 * Created by 隽 on 2017/3/30.
 */
public interface BaseService<T>
{
    //添加单个对象
    void insert (T entity);

    //修改单个对象
    void update(T entity);

    //删除单个对象
    void delete(T entity);

    //查询单个对象
    T select(T entity);

    //模糊查询多个用户
    List<T> select(String keyword);

    //查询所有用户
    List<T> select();

    //分页查询

}
