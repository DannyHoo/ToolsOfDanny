package com.danny.reflect.classp;

import com.alibaba.fastjson.JSON;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Temp
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-19 23:07:13
 */
public class Temp extends T{
    private static P p=new P();
    private String i="我是danny";


    public static void main(String[] args) {

        boolean aa=1==p.getJ();
        Temp temp=new Temp();
        T t=new T();
        Object o=new Object();
        System.out.println(Temp.class.getClass().getName());
        boolean b=Temp.class.equals(temp.getClass());
        boolean b1=temp.getClass().equals(t.getClass());
        System.out.println(JSON.toJSONString(temp));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(2147483647);
        System.out.println(2147483647/3600/24);
        System.out.println(2147483647/3600/24/365);
    }


    public P getP() {
        return p;
    }

    public Temp setP(P p) {
        this.p = p;
        return this;
    }

    public String getI() {
        return i;
    }

    public Temp setI(String i) {
        this.i = i;
        return this;
    }
}
