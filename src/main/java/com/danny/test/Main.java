package com.danny.test;

import java.math.BigDecimal;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Main
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-06-28 14:24:57
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal bigDecimal1=new BigDecimal(1000);
        BigDecimal bigDecimal2=new BigDecimal("1000.00");
        System.out.println(bigDecimal2.compareTo(BigDecimal.ZERO));
        System.out.println(bigDecimal1.compareTo(bigDecimal2));
        BeanSetterTest beanSetterTest = new BeanSetterTest().setCloneTimes(0);
        beanSetterTest
                .setCloneTimes(beanSetterTest.getCloneTimes() + 1)
                .setCloneTimes(beanSetterTest.getCloneTimes() + 1)
                .setCloneTimes(beanSetterTest.getCloneTimes() + 1)
                .setCloneTimes(beanSetterTest.getCloneTimes() + 1);
        System.out.println(beanSetterTest.getCloneTimes());
    }
}
