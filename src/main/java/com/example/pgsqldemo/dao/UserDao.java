package com.example.pgsqldemo.dao;

import com.example.pgsqldemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/3/16$ 14:59$
 * @UpdateUser:
 * @UpdateDate: 2020/3/16$ 14:59$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Mapper
public interface  UserDao {
    Integer userInsert(@Param("user") UserInfo user);

    UserInfo queryById(@Param("id") Long id);
}
