package com.demo.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Register implements Serializable {
    private Integer id;
    private String caseNumber;
    private String realName;
    private Integer gender;
    private String IDnumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
    private Integer age;
    private char ageType;
    private String homeAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date visitDate;
    private String noon;
    private Integer deptID;
    private Integer userID;
    private Integer registLeID;
    private Integer settleID;
    private char isBook;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registTime;
    private Integer registerID;
    private Integer visitState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public char getAgeType() {
        return ageType;
    }

    public void setAgeType(char ageType) {
        this.ageType = ageType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getNoon() {
        return noon;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getRegistLeID() {
        return registLeID;
    }

    public void setRegistLeID(Integer registLeID) {
        this.registLeID = registLeID;
    }

    public Integer getSettleID() {
        return settleID;
    }

    public void setSettleID(Integer settleID) {
        this.settleID = settleID;
    }

    public char getIsBook() {
        return isBook;
    }

    public void setIsBook(char isBook) {
        this.isBook = isBook;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public Integer getVisitState() {
        return visitState;
    }

    public void setVisitState(Integer visitState) {
        this.visitState = visitState;
    }
}
