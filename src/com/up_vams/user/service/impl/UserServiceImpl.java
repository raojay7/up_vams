package com.up_vams.user.service.impl;

import com.up_vams.user.dao.UserMapper;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 隽 on 2017/3/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User entity)
    {
        return userMapper.insert(entity);
    }

    @Override
    public int update(User entity)
    {
        return userMapper.update(entity);
    }

    @Override
    public int delete(User entity)
    {
        return userMapper.delete(entity);
    }

    @Override
    public User select(User entity)
    {
        return userMapper.select(entity);
    }

    @Override
    public List<User> select(String keyword)
    {
        return userMapper.selectList(keyword);
    }

    @Override
    public List<User> select()
    {
        return userMapper.selectAll();
    }

    @Override
    public User selectByPK(String pk)
    {
        return userMapper.selectByPK(pk);
    }
}
