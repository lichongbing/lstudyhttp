package com.lichongbing.lstudyhttp.constant;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 8:53 上午
 * @description: 水气配置文件信息
 */
@ConfigurationProperties(prefix = "watergas")
public class WatergasProperties {
    private String userRename;
    private String token;

    public String getUserRename() {
        return userRename;
    }

    public void setUserRename(String userRename) {
        this.userRename = userRename;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public WatergasProperties() {
    }
}
