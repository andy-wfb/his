package com.demo.dao;

import com.demo.domain.Register;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface RegistDao {
    public Register getMedicalInfo(String caseID);

    public void doRegist();
}
