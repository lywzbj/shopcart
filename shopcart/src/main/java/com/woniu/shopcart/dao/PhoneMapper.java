package com.woniu.shopcart.dao;

import com.woniu.shopcart.pojo.Phone;

import java.util.List;

public interface PhoneMapper {
    int deleteByPrimaryKey(Integer phoneid);

    int insert(Phone record);

    int insertSelective(Phone record);

    Phone selectByPrimaryKey(Integer phoneid);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKey(Phone record);

    List<Phone> quaryAll();
}