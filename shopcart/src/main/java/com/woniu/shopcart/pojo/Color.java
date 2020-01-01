package com.woniu.shopcart.pojo;

import java.io.Serializable;

public class Color implements Serializable {
    private Integer id;

    private String phonecolor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhonecolor() {
        return phonecolor;
    }

    public void setPhonecolor(String phonecolor) {
        this.phonecolor = phonecolor;
    }
}