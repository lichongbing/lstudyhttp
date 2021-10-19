package com.lichongbing.lstudyhttp.result;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 7:35 上午
 * @description: TODO
 */
public class GetTokenResult {
    private boolean ok;

    private int code;

    private String message;

    private String token;

    private String exprieTime;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExprieTime() {
        return exprieTime;
    }

    public void setExprieTime(String exprieTime) {
        this.exprieTime = exprieTime;
    }

    public GetTokenResult() {
    }

    @Override
    public String toString() {
        return "GetTokenResult{" +
                "ok=" + ok +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                ", exprieTime='" + exprieTime + '\'' +
                '}';
    }
}
