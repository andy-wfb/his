package com.demo.service.impl;

import com.demo.dao.CommonDao;
import com.demo.dao.UserDao;
import com.demo.domain.Dept;
import com.demo.domain.User;
import com.demo.service.UserService;
import com.demo.vo.SelectItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    /**
     * 登陆的方法
     *
     * @param userName
     * @param password
     */
    @Override
    public User loginService(String userName, String password) {
        User user=userDao.loginDao(userName,password);
        System.out.println(user);
        return user;
    }

    /**
     * 查询所有用户的方法(还未实现)
     */
    @Override
    public List<User> queryUserList() {
        return null;
    }

    /**
     * 查询所有科室的方法
     * @return
     */
    @Autowired
    private CommonDao commonDao;

    public List<SelectItem<Integer,String>> deptSelectList() {
        System.out.println("service层中的查询所有部门的方法被执行");
        return commonDao.deptSelectList();
    }

    /**
     * 当页面加载完后,查询所有挂号号别
     *
     * @return
     */
    @Override
    public List<SelectItem<Integer, String>> registLevelSelectList() {
        return commonDao.registLevelSelectList();
    }

    /**
     * 当页面加载完后,查询所有的结算类别
     *
     * @return
     */
    @Override
    public List<SelectItem<Integer, String>> feeTypeSelectList() {
        return commonDao.feeTypeSelectList();
    }

    /**
     * 当页面加载完后,查询所有的收费方式
     */
    @Override
    public List<SelectItem<Integer, String>> MTCSelectList() {
        return commonDao.MTCSelectList();
    }

    /**
     * 当页面加载完后,查询性别
     */
    @Override
    public List<SelectItem<String, String>> sexSelectList() {
        return commonDao.sexSelectList();
    }

    /**
     * 当页面加载完,查询所有年龄类型
     *
     * @return
     */
    @Override
    public List<SelectItem<Integer, String>> ageTypeSelectList() {
        SelectItem<Integer, String> s1=new SelectItem<Integer, String>();
        SelectItem<Integer, String> s2=new SelectItem<Integer, String>();
        SelectItem<Integer, String> s3=new SelectItem<Integer, String>();
        List<SelectItem<Integer, String>> list = new ArrayList<>();
        s1.setValue(1);
        s1.setText("岁");
        list.add(s1);

        s2.setValue(2);
        s2.setText("月");
        list.add(s2);

        s3.setValue(3);
        s3.setText("天");
        list.add(s3);

        return list;
    }

    /**
     * 获取一个新的病历号
     *
     * @return
     */
    @Override
    public Integer getNewCaseNumber() {
        Integer num = Integer.parseInt(commonDao.getNewCaseNumber())+1;
        return num;
    }

    /**
     * 根据挂号号别的ID,查询挂号号别对应的费用
     *
     * @param registLevel
     * @return
     */
    @Override
    public Double getFeeByRegistLevel(Integer registLevel) {
        System.out.println("根据号别ID查询费用的方法执行了");
        return commonDao.getFeeByRegistLevel(registLevel);
    }


}
