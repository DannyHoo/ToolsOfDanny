package com.danny.test;

/**
 * @author huyuyang@lxfintech.com
 * @Title: BeanSetterTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-28 14:24:29
 */
public class BeanSetterTest {
    private int cloneTimes;

    public int getCloneTimes() {
        return cloneTimes;
    }

    public BeanSetterTest setCloneTimes(int cloneTimes) {
        this.cloneTimes = cloneTimes;
        return this;
    }
}
