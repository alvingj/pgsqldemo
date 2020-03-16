package com.example.pgsqldemo.service.impl;

import com.example.pgsqldemo.dao.UserDao;
import com.example.pgsqldemo.entity.UserInfo;
import com.example.pgsqldemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/3/16$ 15:05$
 * @UpdateUser:
 * @UpdateDate: 2020/3/16$ 15:05$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer userInsert(UserInfo user) {
        return userDao.userInsert(user);
    }

    @Override
    public UserInfo queryById(Long id) {
        return userDao.queryById(id);
    }
}
