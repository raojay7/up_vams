package com.up_vams.core.dao;

import java.util.List;

/**
 * Created by wzw on 2017/3/30.
 */
public interface BaseMapper<T> {

    //增加对象
    int insert(T t);

    //删除对象
    int delete(T t);

    //查询对象
    T select(T t);

    //修改对象
    int update(T t);


    //模糊查询列表
    List<T> selectList(String keyword);

    //查询所有对象
    List<T> selectAll();


}
