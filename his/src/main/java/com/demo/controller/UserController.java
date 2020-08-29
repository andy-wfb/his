package com.demo.controller;

import com.demo.domain.Dept;
import com.demo.domain.User;
import com.demo.service.UserService;
import com.demo.vo.SelectItem;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {

    /**
     * 通过用户名和密码实现登陆
     */
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public User login(@RequestBody User body){

        String userName=body.getUserName();
        String password=body.getPassword();

        User user=userService.loginService(userName,password);
        return user;
    }

    /**
     * 当页面加载完,调用此方法到后台查出所有的科室,因为每个科室每天都会上班
     */
    @RequestMapping("/deptSelectList")
    public List<SelectItem<Integer,String>> deptSelectList(){
        System.out.println("查询所有部门的controller执行了");
        System.out.println(userService);
        List<SelectItem<Integer,String>> list = userService.deptSelectList();
        return list;
    }
    /**
     * 当页面加载完后,查询所有挂号号别
     *
     * @return
     */
    @RequestMapping("/registLevelSelectList")
    public List<SelectItem<Integer,String>> registLevelSelectList(){
        System.out.println("controller中的registLevelSelectList查询所有挂号号别方法被执行了");
        return userService.registLevelSelectList();
    }
    /**
     * 当页面加载完后,查询所有的结算类别
     *
     * @return
     */
    @RequestMapping("/feeTypeSelectList")
    public List<SelectItem<Integer,String>> feeTypeSelectList(){
        System.out.println("controller中的feeTypeSelectList查询所有的结算类别方法执行了");
        return userService.feeTypeSelectList();
    }
    /**
     * 当页面加载完后,查询所有的收费方式
     */
    @RequestMapping("/MTCSelectList")
    public List<SelectItem<Integer,String>> MTCSelectList(){
        System.out.println("controller中的MTCSelectList查询所有的收费方式方法执行了");
        return userService.MTCSelectList();
    }

    /**
     * 当页面加载完后,查询性别
     */
    @RequestMapping("/sexSelectList")
    public List<SelectItem<String,String>> sexSelectList(){
        System.out.println("查询性别的方法sexSelectList执行了");
        List<SelectItem<String,String>> list = userService.sexSelectList();

        return list;
    }

    /**
     * 当页面加载完,查询所有年龄类型
     * @return
     */
    @RequestMapping("/ageTypeSelectList")
    public List<SelectItem<Integer,String>> ageTypeSelectList(){
        System.out.println("查询年龄类型的方法ageTypeSelectList执行了");
        List<SelectItem<Integer,String>> list = userService.ageTypeSelectList();
        return list;
    }
    /**
     * 获取一个新的病历号
     */
    @RequestMapping("/getNewCaseNumber")
    public Integer getNewCaseNumber(){
        return userService.getNewCaseNumber();
    }

    /**
     * 根据挂号号别的ID,查询挂号号别对应的费用
     */
    @RequestMapping("/getFeeByRegistLevel")
    public Double getFeeByRegistLevel(Integer registLevel){
        System.out.println("根据号别ID查询费用的方法执行了");
        return userService.getFeeByRegistLevel(registLevel);
    }

}
