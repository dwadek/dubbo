package com.dwadek.dubbo.web;

import com.dwadek.dubbo.model.User;
import com.dwadek.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String userDetail(Model model, Integer id){

        //根据用户标识获取用户详情
        User user = userService.queryUserById(id);

        //获取用户总人数
        Integer count = userService.queryUserCount();

        model.addAttribute("user",user);
        model.addAttribute("count",count);

        return "userDetail";
    }
}
