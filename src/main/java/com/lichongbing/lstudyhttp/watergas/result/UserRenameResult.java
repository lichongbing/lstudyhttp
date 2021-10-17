package com.lichongbing.lstudyhttp.watergas.result;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 7:44 上午
 * @description: TODO
 */
public class UserRenameResult {
    private boolean ok;
    private String message;

    public UserRenameResult() {
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserRenameResult{" +
                "ok=" + ok +
                ", message='" + message + '\'' +
                '}';
    }
}
