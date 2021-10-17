package com.lichongbing.lstudyhttp.watergas.controller;

import com.lichongbing.lstudyhttp.watergas.constant.WatergasProperties;
import com.lichongbing.lstudyhttp.watergas.model.Token;
import com.lichongbing.lstudyhttp.watergas.model.UserRename;
import com.lichongbing.lstudyhttp.watergas.remote.HttpApi;
import com.lichongbing.lstudyhttp.watergas.result.GetTokenResult;
import com.lichongbing.lstudyhttp.watergas.result.UserRenameResult;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/16 9:25 下午
 * @description: TODO
 */
@RestController
@Slf4j
@RequestMapping(value = "/watergas/")
public class Watergascontroller {
    @Value("${watergas.loginName}")
    private String loginName;
    @Value("${watergas.password}")
    private String password;
    @Autowired
    private HttpApi httpApi;
    @Autowired
    WatergasProperties watergasProperties;



    @GetMapping("/userrename")
    public String userRename() throws IOException {
        String token = this.token();
        String passwordMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        UserRename userRename = new UserRename();
        userRename.setLoginName(loginName);
        userRename.setPassword(passwordMd5);
        userRename.setToken(token);
        userRename.setYhm("李崇兵");
        userRename.setXhm("林小平");
        userRename.setDz("巴中");
        userRename.setYhkh("88888888");
        userRename.setYsbh(7777777);
        userRename.setYsqbh(77777);
        userRename.setZysbh(7777777);
        userRename.setYlxdh("17778479306");
        userRename.setXlxdh("18008070710");
        userRename.setSfzh("510521199210037996");
        userRename.setSfzbase64("ssssssssssssss");
        String userRenameurl = watergasProperties.getUserRename();
        String message = httpApi.userRename(userRenameurl, userRename).execute().body().getMessage();

        return message;
    }

    @GetMapping("/token")
    public String token() throws IOException {
        String tokenurl = watergasProperties.getToken();
        String passwordMd5 = DigestUtils.md5DigestAsHex(password.getBytes());
        Token token = new Token();
        token.setLoginName(loginName);
        token.setPassword(passwordMd5);
        GetTokenResult getTokenResult = httpApi.getToken(tokenurl, token).execute().body();
        String token1 = getTokenResult.getToken();
        return token1;
    }
}
