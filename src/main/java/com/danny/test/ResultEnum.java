package com.danny.test;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ResultEnum
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-21 00:12:30
 */
public enum ResultEnum {
    RESULT_A(1,"resultA"),
    RESULT_B(2,"resultB");

    private int code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public ResultEnum setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResultEnum setMessage(String message) {
        this.message = message;
        return this;
    }
}
