package com.woniu.shopcart.controller;

import com.woniu.shopcart.pojo.Phone;
import com.woniu.shopcart.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: shopcart
 * @description: 手机前台数据控制类
 * @author: 罗宇
 * @create: 2020-01-01 16:25
 **/
@RestController
@RequestMapping(value = "/phone")
public class PhoneController {

    @Autowired
    private IPhoneService phoneService;

    @RequestMapping(value = "/all")
    public List<Phone> allPhone(){

        List<Phone> phones = phoneService.quaryAllPhone();

        return phones;
    }


    @RequestMapping(value = "/getPhone")
    public Phone getPhone(Integer id){

        Phone phone = phoneService.quaryById(id);

        return phone;
    }

}
