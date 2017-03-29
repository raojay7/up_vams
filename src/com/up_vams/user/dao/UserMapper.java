package com.up_vams.user.dao;

import com.up_vams.user.entity.User;

public interface UserMapper {

    User login(User user);

    int register(User user);



}