package com.dwadek.dubbo.service;

import com.dwadek.dubbo.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User queryUserById(Integer id);
}
