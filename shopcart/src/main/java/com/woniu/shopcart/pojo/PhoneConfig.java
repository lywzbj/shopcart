package com.woniu.shopcart.pojo;

import java.io.Serializable;

public class PhoneConfig implements Serializable {
    private Integer id;

    private String configtype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConfigtype() {
        return configtype;
    }

    public void setConfigtype(String configtype) {
        this.configtype = configtype;
    }
}