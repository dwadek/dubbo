package com.dwadek.dubbo.service.impl;

import com.dwadek.dubbo.model.User;
import com.dwadek.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {

        User user = new User();
        user.setId(id);
        user.setUsername("jack");
        user.setAge(20);

        return user;
    }
}
