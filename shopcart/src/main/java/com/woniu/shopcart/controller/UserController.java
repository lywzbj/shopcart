package com.woniu.shopcart.controller;

import com.woniu.shopcart.pojo.User;
import com.woniu.shopcart.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shopcart
 * @description: 用户操作类
 * @author: 罗宇
 * @create: 2019-12-31 21:34
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/login")
    public User login(User user){

      User  user1=userService.findUserByName(user.getUserName());

        return user1;
    }


    @RequestMapping(value = "/register")
    public String registerUser(User user){

    userService.addUser(user);
        return "success";
    }


}
