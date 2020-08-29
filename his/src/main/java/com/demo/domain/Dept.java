package com.demo.domain;

import java.io.Serializable;

public class Dept implements Serializable {
    private Integer id;
    private String deptCode;
    private String deptName;
    private Integer deptCategoryId;
    private Integer deptType;
    private Integer delMark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptCategoryId() {
        return deptCategoryId;
    }

    public void setDeptCategoryId(Integer deptCategoryId) {
        this.deptCategoryId = deptCategoryId;
    }

    public Integer getDeptType() {
        return deptType;
    }

    public void setDeptType(Integer deptType) {
        this.deptType = deptType;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}
