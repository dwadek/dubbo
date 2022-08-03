package com.dwadek.dubbo.service;

import com.dwadek.dubbo.model.User;

public interface UserService {

    User queryUserById(Integer id);
}
