package com.woniu.shopcart.service.impl;

import com.woniu.shopcart.dao.UserMapper;
import com.woniu.shopcart.pojo.User;
import com.woniu.shopcart.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shopcart
 * @description: 用户操作接口实现类
 * @author: 罗宇
 * @create: 2019-12-31 21:39
 **/
@Service
public class UserServiceImpl  implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByName(String name) {
        return userMapper.findUserByName(name);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
