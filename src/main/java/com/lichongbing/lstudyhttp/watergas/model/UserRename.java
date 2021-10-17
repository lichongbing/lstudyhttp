package com.lichongbing.lstudyhttp.watergas.model;

/**
 * @author lichongbing
 * @version 1.0.0
 * @createdate 2021/10/17 7:49 上午
 * @description: TODO
 */
public class UserRename {
    private String loginName;//用户名必须获取token时一致
    private String password; //密码（MD5 32位小写）必须获取token时一致
    private String token; //Login返回的，必须在有效时间内
    private String yhm; //原户名，必填，varchar(100)
    private String xhm; //现户名，必填，varchar(100)
    private String dz; //地址，必须，varchar(100)
    private String yhkh; //一卡通号，可空，varchar(8)
    private int ysbh; //用水编号，可空，int
    private int ysqbh; //用气编号，可空，int
    private int zysbh; //直饮水编号，可空,int
    private String ylxdh; //原户主电话，必填，varchar(30)
    private String xlxdh; //现户主电话，必填，varchar(30)
    private String sfzh; //身份证号，必填,char(18)
    private String sfzbase64; //身份证扫描件Base64编码(jgp格式)，建议jpg文件5M内

    public UserRename() {
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getXhm() {
        return xhm;
    }

    public void setXhm(String xhm) {
        this.xhm = xhm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public String getYhkh() {
        return yhkh;
    }

    public void setYhkh(String yhkh) {
        this.yhkh = yhkh;
    }

    public int getYsbh() {
        return ysbh;
    }

    public void setYsbh(int ysbh) {
        this.ysbh = ysbh;
    }

    public int getYsqbh() {
        return ysqbh;
    }

    public void setYsqbh(int ysqbh) {
        this.ysqbh = ysqbh;
    }

    public int getZysbh() {
        return zysbh;
    }

    public void setZysbh(int zysbh) {
        this.zysbh = zysbh;
    }

    public String getYlxdh() {
        return ylxdh;
    }

    public void setYlxdh(String ylxdh) {
        this.ylxdh = ylxdh;
    }

    public String getXlxdh() {
        return xlxdh;
    }

    public void setXlxdh(String xlxdh) {
        this.xlxdh = xlxdh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getSfzbase64() {
        return sfzbase64;
    }

    public void setSfzbase64(String sfzbase64) {
        this.sfzbase64 = sfzbase64;
    }

    @Override
    public String toString() {
        return "UserRename{" +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                ", yhm='" + yhm + '\'' +
                ", xhm='" + xhm + '\'' +
                ", dz='" + dz + '\'' +
                ", yhkh='" + yhkh + '\'' +
                ", ysbh=" + ysbh +
                ", ysqbh=" + ysqbh +
                ", zysbh=" + zysbh +
                ", ylxdh='" + ylxdh + '\'' +
                ", xlxdh='" + xlxdh + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", sfzbase64='" + sfzbase64 + '\'' +
                '}';
    }
}
