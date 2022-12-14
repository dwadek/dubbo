package com.dwadek.dubbo.web;

import com.alibaba.dubbo.config.annotation.Service;
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
        public String userDetail(Model model,Integer id){
            User user = userService.queryUserById(id);
            model.addAttribute("user",user);
            return "userDetail";
        }
}
