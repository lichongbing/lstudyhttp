package com.lichongbing.lstudyhttp.model;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 7:16 上午
 * @description: TODO
 */
public class Token {
    private String loginName;
    private String password;

    public Token() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
