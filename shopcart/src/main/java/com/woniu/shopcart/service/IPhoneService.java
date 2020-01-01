package com.woniu.shopcart.service;

import com.woniu.shopcart.pojo.Phone;

import java.util.List;

public interface IPhoneService {

    List<Phone> quaryAllPhone();

    Phone quaryById(Integer id);


}
