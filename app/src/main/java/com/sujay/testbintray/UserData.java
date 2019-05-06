package com.sujay.testbintray;
// Created by $USER_NAME on 2019-05-06.

import java.io.Serializable;

public class UserData implements Serializable {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    private String userName;
    private String password;
    private int loginType;
}
