package com.up_vams.user.service.impl;

import com.up_vams.user.dao.UserMapper;
import com.up_vams.user.entity.User;
import com.up_vams.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 隽 on 2017/3/29.
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void register(User user)
    {
        userMapper.register(user);
    }

    @Override
    public User login(User user)
    {
        return userMapper.login(user);
    }
}
