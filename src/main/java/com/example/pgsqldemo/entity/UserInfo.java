package com.example.pgsqldemo.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: xiedb
 * @Date: 2018/6/7
 * @Description: 用户信息
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class UserInfo {
    private Long id;
    private Long activityId;
    private String imei;
    private String lenovoId;
    private String lenovoName;
    private String phone;
    private String email;
}
