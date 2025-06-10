package com.sky.jvmtruning.entity;

import lombok.Data;

@Data
public class People {
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private String email;
    private String idCard;
    private String password;
    private String remark;
    private String createUser;
    private String updateUser;
    private String createTime;
    private String updateTime;
    private String isDeleted;
    private String version;
    private String status;
    private String sort;
    private String createDate;

    public People() {
        this.name = "张三";
        this.age = 18;
        this.sex = "男";
        this.address = "北京市";
        this.phone = "13800138000";
        this.email = "zhangsan@qq.com";
        this.idCard = "44010119900101001X";
        this.password = "123456";
        this.remark = "备注";
        this.createUser = "admin";
        this.updateUser = "admin";
        this.createTime = "2020-01-01 00:00:00";
        this.updateTime = "2020-01-01 00:00:00";
        this.isDeleted = "0";
        this.version = "1.0";
        this.status = "1";
        this.sort = "1";
        this.createDate = "2020-01-01";

    }
}
