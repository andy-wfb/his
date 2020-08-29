package com.demo.controller;

import com.demo.service.RuleService;
import com.demo.vo.RegisDoctorListVO;
import com.demo.vo.SelectItem;
import com.demo.vo.UsedQuotaNumberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rule")
public class RuleHandler {
    @Autowired
    private RuleService ruleService;
    @RequestMapping("/getWorkDoctorList")
    public List<SelectItem<Integer,String>> getWorkDoctorList(RegisDoctorListVO vo){
        System.out.println("controller中的getWorkDoctorList方法执行了");
        System.out.println("看诊当天日期"+vo.getSchedDate());
        List<SelectItem<Integer,String>> list = ruleService.getWorkDoctorList(vo);
        return list;
    }

    /**
     * 获取挂号限额的方法
     */
    @RequestMapping("/getQuotaNumber")
    public Integer getQuotaNumber(Integer registLevelId){
        System.out.println("获取挂号限额的方法getQuotaNumber执行了");
        System.out.println("获取挂号限额的参数:挂号号别:"+registLevelId);
        return ruleService.getQuotaNumber(registLevelId);
    }

    /**
     * 获取已经看完诊的数量
     */
    @RequestMapping("/getUsedQuotaNumber")
    public Integer getUsedQuotaNumber(UsedQuotaNumberVO vo){
        System.out.println("获取userid::"+vo.getUserId()+"获取noon"+vo.getNoon());
        System.out.println("获取当天的看诊日期"+vo.getVdate());
        Integer num=ruleService.getUsedQuotaNumber(vo);
        return num;
    }

}
