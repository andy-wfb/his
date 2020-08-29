package com.demo.service;

import com.demo.domain.Dept;
import com.demo.domain.User;
import com.demo.vo.SelectItem;

import java.util.List;

public interface UserService {
    /**
     * 登陆的方法
     */
    public User loginService(String userName,String password);

    /**
     * 查询所有用户的方法
     */

    public List<User> queryUserList();

    /**
     * 当页面加载完后,查询所有科室的方法
     * @return
     */
    public List<SelectItem<Integer,String>> deptSelectList();

    /**
     * 当页面加载完后,查询所有挂号号别
     * @return
     */
    public List<SelectItem<Integer,String>> registLevelSelectList();

    /**
     * 当页面加载完后,查询所有的结算类别
     * @return
     */
    public List<SelectItem<Integer,String>> feeTypeSelectList();

    /**
     * 当页面加载完后,查询所有的收费方式
     */
    public List<SelectItem<Integer,String>> MTCSelectList();

    /**
     * 当页面加载完后,查询性别
     */
    public List<SelectItem<String, String>> sexSelectList();

    /**
     * 当页面加载完,查询所有年龄类型
     * @return
     */
    public List<SelectItem<Integer, String>> ageTypeSelectList();

    /**
     * 获取一个新的病历号
     * @return
     */
    public Integer getNewCaseNumber();

    /**
     * 根据挂号号别的ID,查询挂号号别对应的费用
     * @param registLevel
     * @return
     */
    public Double getFeeByRegistLevel(Integer registLevel);
}
