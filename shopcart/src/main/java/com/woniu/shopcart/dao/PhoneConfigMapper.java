package com.woniu.shopcart.dao;

import com.woniu.shopcart.pojo.PhoneConfig;

public interface PhoneConfigMapper {
    int insert(PhoneConfig record);

    int insertSelective(PhoneConfig record);
}