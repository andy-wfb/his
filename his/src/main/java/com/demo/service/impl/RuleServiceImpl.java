package com.demo.service.impl;

import com.demo.dao.RuleDao;
import com.demo.service.RuleService;
import com.demo.vo.RegisDoctorListVO;
import com.demo.vo.SelectItem;
import com.demo.vo.UsedQuotaNumberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {


    @Autowired
    private RuleDao ruleDao;
    @Override
    public List<SelectItem<Integer, String>> getWorkDoctorList(RegisDoctorListVO vo) {
        System.out.println("service中的getWorkDoctorList方法执行了");
        return ruleDao.getWorkDoctorList(vo);
    }

    /**
     * 当选择看诊医生后,会查询出看诊数量的限额
     *
     * @param registLevelId
     */
    @Override
    public Integer getQuotaNumber(Integer registLevelId) {
        System.out.println("挂号限额"+ruleDao.getQuotaNumber(registLevelId));
        return ruleDao.getQuotaNumber(registLevelId);
    }

    /**
     * 获取已经看完诊的数量
     *
     * @param vo
     */
    @Override
    public Integer getUsedQuotaNumber(UsedQuotaNumberVO vo) {
        Integer num = ruleDao.getUsedQuotaNumber(vo);
        return num;
    }
}
