package com.demo.service;

import com.demo.vo.RegisDoctorListVO;
import com.demo.vo.SelectItem;
import com.demo.vo.UsedQuotaNumberVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RuleService {
    public List<SelectItem<Integer,String>> getWorkDoctorList(RegisDoctorListVO vo);

    /**
     * 当选择看诊医生后,会查询出看诊数量的限额
     */
    public Integer getQuotaNumber(Integer registLevelId);

    /**
     * 获取已经看完诊的数量
     */
    public Integer getUsedQuotaNumber(UsedQuotaNumberVO vo);
}
