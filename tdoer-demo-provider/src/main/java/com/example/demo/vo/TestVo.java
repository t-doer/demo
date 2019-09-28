package com.example.demo.vo;

import java.util.Date;

public class TestVo {

    private String str = "";
    private Date now = new Date();

    public String getStr() {
        return this.str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Date getNow() {
        return this.now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public TestVo() {
    }
    public TestVo(String str) {
        this.str = str;
    }
}