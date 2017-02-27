package com.danny.reflect.method;

import java.lang.reflect.Method;

/**
 * @author huyuyang@lxfintech.com
 * @Title: MethodInvokeA
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-21 21:28:42
 */
public class MethodInvokeB {
    private int field1;
    private String field2;

    public int getField1() {
        return field1;
    }

    public MethodInvokeB setField1(int field1) {
        this.field1 = field1;
        return this;
    }

    public String getField2() {
        return field2;
    }

    public MethodInvokeB setField2(String field2) {
        this.field2 = field2;
        return this;
    }

    public Object getValueByMethodName(MethodInvokeB methodInvoke, String methodName) {
        try {
            Method method = methodInvoke.getClass().getDeclaredMethod(methodName, null);
            method.setAccessible(true);
            return method.invoke(methodInvoke);
        } catch (Exception e) {
            return null;
        }
    }
}
