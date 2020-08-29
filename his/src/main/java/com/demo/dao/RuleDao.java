package com.demo.dao;

import com.demo.vo.RegisDoctorListVO;
import com.demo.vo.SelectItem;
import com.demo.vo.UsedQuotaNumberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface RuleDao {
    /**
     * 根据四个参数,查询在班医生列表
     * @param vo
     * @return
     */
    public List<SelectItem<Integer, String>> getWorkDoctorList(RegisDoctorListVO vo);

    /**
     * 当选择看诊医生后,会查询出看诊数量的限额
     */
    public Integer getQuotaNumber(Integer registLevelId);

    /**
     * 获取已经看完诊的数量
     *
     * @param vo
     */
    public Integer getUsedQuotaNumber(UsedQuotaNumberVO vo);
}
