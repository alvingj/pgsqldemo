package com.example.pgsqldemo.service;

import com.example.pgsqldemo.entity.UserInfo;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/3/16$ 15:04$
 * @UpdateUser:
 * @UpdateDate: 2020/3/16$ 15:04$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface IUserService {

    Integer userInsert(UserInfo user);

    UserInfo queryById(Long id);
}
