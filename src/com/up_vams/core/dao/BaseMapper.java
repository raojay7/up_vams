package com.up_vams.core.dao;

import com.up_vams.core.entity.Page;

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

    //通过主键查询对象
    T selectByPK(String pk);

    //修改对象
    int update(T t);


    //模糊查询列表
    List<T> selectList(String keyword);

    //查询所有对象
    List<T> selectAll();

    //分页动态查询数据列表可通过关键字
    List<T> selectPageList(Page<T> page);

    //动态查询总记录数
    Integer selectTotalRecord(Page<T> page);


}
