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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getLenovoId() {
        return lenovoId;
    }

    public void setLenovoId(String lenovoId) {
        this.lenovoId = lenovoId;
    }

    public String getLenovoName() {
        return lenovoName;
    }

    public void setLenovoName(String lenovoName) {
        this.lenovoName = lenovoName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
