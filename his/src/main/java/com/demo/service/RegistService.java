package com.demo.service;

import com.demo.domain.Register;
import com.demo.vo.RegistVO;

public interface RegistService {
    /**
     * 提交挂号,将挂号数据提交到数据库
     * @param register
     * @return
     */
    public void doRegist(Register register);

    /**
     * 到数据库中查询病历号
     * @param caseID
     * @return
     */
    public Register getMedicalInfo(String caseID);

}
