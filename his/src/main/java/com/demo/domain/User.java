package com.demo.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String realName;
    private Integer userType;
    private Integer docTitleId;
    private Character isScheduling;
    private Integer DeptID;
    private Integer RegistLeId;
    private Integer DelMark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getDocTitleId() {
        return docTitleId;
    }

    public void setDocTitleId(Integer docTitleId) {
        this.docTitleId = docTitleId;
    }

    public Character getIsScheduling() {
        return isScheduling;
    }

    public void setIsScheduling(Character isScheduling) {
        this.isScheduling = isScheduling;
    }

    public Integer getDeptID() {
        return DeptID;
    }

    public void setDeptID(Integer deptID) {
        DeptID = deptID;
    }

    public Integer getRegistLeId() {
        return RegistLeId;
    }

    public void setRegistLeId(Integer registLeId) {
        RegistLeId = registLeId;
    }

    public Integer getDelMark() {
        return DelMark;
    }

    public void setDelMark(Integer delMark) {
        DelMark = delMark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", userType=" + userType +
                ", docTitleId=" + docTitleId +
                ", isScheduling=" + isScheduling +
                ", DeptID=" + DeptID +
                ", RegistLeId=" + RegistLeId +
                ", DelMark=" + DelMark +
                '}';
    }
}
