package com.example.pgsqldemo.controller;

import com.example.pgsqldemo.entity.UserInfo;
import com.example.pgsqldemo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/3/16$ 15:06$
 * @UpdateUser:
 * @UpdateDate: 2020/3/16$ 15:06$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("/userInsert")
    public Integer userInsert(UserInfo user) {
        return userService.userInsert(user);
    }

    @GetMapping("/queryById")
    public UserInfo queryById(Long id) {
        log.info("queryById", id);
        return userService.queryById(id);
    }
}
