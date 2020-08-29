package com.demo.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 挂号的业务规则类
 */
public class RegisDoctorListVO {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date schedDate;

    private String noon;
    private Integer deptId;
    private Integer registLevel;

    public Date getSchedDate() {
        return schedDate;
    }

    public void setSchedDate(Date schedDate) {
        this.schedDate = schedDate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getRegistLevel() {
        return registLevel;
    }

    public void setRegistLevel(Integer registLevel) {
        this.registLevel = registLevel;
    }
}
