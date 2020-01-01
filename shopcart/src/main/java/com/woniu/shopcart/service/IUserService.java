package com.woniu.shopcart.service;

import com.woniu.shopcart.pojo.User;

public interface IUserService {

    User findUserByName(String name);

    void addUser(User user);

}
