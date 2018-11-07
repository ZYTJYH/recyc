package com.zkjc.recyc.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {
    private String name;
    private String phone;
    private String password;

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
