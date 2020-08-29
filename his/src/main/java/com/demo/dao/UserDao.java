package com.demo.dao;

import com.demo.domain.Dept;
import com.demo.domain.User;
import com.demo.vo.SelectItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    /**
     * 访问数据库,查询该用户是否存在
     */
    public User loginDao(String userName, String password);

    /**
     * 查询所有用户的方法
     *
     */

    public List<User> queryUserList();

}
