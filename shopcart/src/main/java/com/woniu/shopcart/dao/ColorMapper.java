package com.woniu.shopcart.dao;

import com.woniu.shopcart.pojo.Color;

public interface ColorMapper {
    int insert(Color record);

    int insertSelective(Color record);
}