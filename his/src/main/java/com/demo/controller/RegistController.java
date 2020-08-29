package com.demo.controller;

import com.demo.domain.Register;
import com.demo.service.impl.RegistServiceImpl;
import com.demo.vo.RegistVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/regist")
public class RegistController {

    @Autowired
    private RegistServiceImpl registService;
    /**
     * RegistVO封装的值对象(包含挂号的基本信息)
     */
    @RequestMapping("/doRegist")
    public Integer doRegist(Register register){
        System.out.println("注册挂号信息的controller中的方法执行了"+register);
//        registService.doRegist(register);

        //如果成功,返回1,如果异常就会跳到vue的catch
        return 1;
    }

    /**
     * 到数据库中查询病历号
     * @param caseID
     * @return
     */
    @RequestMapping("/getMedicalInfo")
    public Register getMedicalInfo(String caseID){
        System.out.println("病历号是:" + caseID);
        System.out.println("controller中查询病历号的方法getMedicalInfo执行了");
        Register register = registService.getMedicalInfo(caseID);
        return register;
    }
}
