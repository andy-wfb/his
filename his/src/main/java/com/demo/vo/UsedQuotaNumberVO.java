package com.demo.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UsedQuotaNumberVO {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date vdate;
    private String noon;
    private Integer userId;

    public Date getVdate() {
        return vdate;
    }

    public void setVdate(Date vdate) {
        this.vdate = vdate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
