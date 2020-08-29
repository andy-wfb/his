package com.demo.service.impl;

import com.demo.dao.RegistDao;
import com.demo.domain.Register;
import com.demo.service.RegistService;
import com.demo.vo.RegistVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegistServiceImpl implements RegistService {

    @Autowired
    private RegistDao registDao;

    //事务:如果在挂号过程中出现异常,就会回滚
    @Transactional()
    public void doRegist(Register register) {
        registDao.doRegist();
        //1/组建一个挂号的对象
        //病历的id
        //真实的姓名
        //性别
        //年龄
        //生日
        //年龄类型
        //地址

        //2/组建一个病例的对象(数据库中已经有了该患者的信息)

        //3组成病历表po对象

        //4保存病历表

        //5保存挂号表数据时得到它的本次新增使用主键id,将该id设置到本次的挂号对象中的id

        //6/根据挂号对象,保存病历页--MedicalRecord

    }

    /**
     * 到数据库中查询病历号
     *
     * @param caseID
     * @return
     */
    @Override
    public Register getMedicalInfo(String caseID) {
        System.out.println(registDao.getMedicalInfo(caseID));
        return registDao.getMedicalInfo(caseID);
    }


}


























