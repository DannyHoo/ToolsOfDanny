package com.danny.reflect.method.lxjr;

/**
 * @author huyuyang@lxfintech.com
 * @Title: CreditAccountResultStatusEnum
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-22 09:30:47
 */
public enum CreditAccountResultStatusEnum {
    SUCCESS(100000, "处理成功"),
    FAILURE(100001,"未知失败");

    private int code;
    private String description;

    CreditAccountResultStatusEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
