package com.woniu.shopcart.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Phone implements Serializable {
    private Integer phoneid;

    private String phonename;

    private String phonedes;

    private String url;

    private BigDecimal price;

    private Integer repertory;

    public Integer getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(Integer phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonename() {
        return phonename;
    }

    public void setPhonename(String phonename) {
        this.phonename = phonename;
    }

    public String getPhonedes() {
        return phonedes;
    }

    public void setPhonedes(String phonedes) {
        this.phonedes = phonedes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
}