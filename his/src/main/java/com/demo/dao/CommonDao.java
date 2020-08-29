package com.demo.dao;

import com.demo.domain.Dept;
import com.demo.vo.SelectItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommonDao {
    /**
     * 查询全部的科室的名字
     */
    public List<SelectItem<Integer,String>> deptSelectList();

    /**
     * 在页面加载完成后,查询所有挂号号别
     *
     */
    public List<SelectItem<Integer, String>> registLevelSelectList();

    /**
     * 当页面加载完后,查询所有的结算类别
     *
     * @return
     */
    public List<SelectItem<Integer, String>> feeTypeSelectList();

    /**
     * 当页面加载完后,查询所有的收费方式
     *
     * @return
     */
    public List<SelectItem<Integer,String>> MTCSelectList();

    /**
     * 当页面加载完后,查询性别
     */
    public List<SelectItem<String,String>> sexSelectList();

    /**
     * 获取新的病历号
     * @return
     */
    public String getNewCaseNumber();

    /**
     * 根据挂号号别的ID,查询挂号号别对应的费用
     *
     * @param registLevel
     * @return
     */
    public Double getFeeByRegistLevel(Integer registLevel);
}
