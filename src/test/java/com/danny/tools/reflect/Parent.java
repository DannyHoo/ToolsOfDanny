package com.danny.tools.reflect;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Parent
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-07-08 00:57:22
 */
public class Parent {
    public String publicField  = "1";

    String defaultField = "2";

    protected String protectedField = "3";

    private String privateField = "4" ;

    public void publicMethod() {
        System.out.println("publicMethod...");
    }

    void defaultMethod() {
        System.out.println("defaultMethod...");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod...");
    }

    private void privateMethod() {
        System.out.println("privateMethod...");
    }
}
