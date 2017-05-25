package com.danny.reflect.classp;

/**
 * @author huyuyang@lxfintech.com
 * @Title: P
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-04-28 18:22:38
 */
public class P {
    public  String i="你好";
    public  Integer j;

    public String getI() {
        return i;
    }

    public P setI(String i) {
        this.i = i;
        return this;
    }

    public int getJ() {
        return j;
    }

    public P setJ(int j) {
        this.j = j;
        return this;
    }
}
