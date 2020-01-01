package com.woniu.shopcart.service.impl;

import com.woniu.shopcart.dao.PhoneMapper;
import com.woniu.shopcart.pojo.Phone;
import com.woniu.shopcart.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shopcart
 * @description: 手机数据库业务类
 * @author: 罗宇
 * @create: 2020-01-01 16:29
 **/
@Service
public class PhoneServiceImpl implements IPhoneService {

    @Autowired
    private PhoneMapper phoneMapper;

    @Cacheable(value = "quaryAllPhone")
    @Override
    public List<Phone> quaryAllPhone() {
        return phoneMapper.quaryAll();
    }

    @Cacheable(value = "quaryById")
    @Override
    public Phone quaryById(Integer id) {
        return phoneMapper.selectByPrimaryKey(id);
    }
}
