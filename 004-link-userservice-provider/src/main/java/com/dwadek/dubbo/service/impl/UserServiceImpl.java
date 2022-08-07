package com.dwadek.dubbo.service.impl;

import com.dwadek.dubbo.model.User;
import com.dwadek.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user  = new User();
        user.setId(10);
        user.setName("wadek");
        return user;
    }

    @Override
    public Integer queryUserCount() {
        return 100;
    }
}
