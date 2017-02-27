package com.danny.reflect.method.accessible;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huyuyang@lxfintech.com
 * @Title: AccessibleTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-21 22:48:22
 */
public class AccessibleTest {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.setField("Hello World!");

        try {
            Method method = a.getClass().getDeclaredMethod("getField");
            System.out.println("The value of accessible : " + method.isAccessible());

            System.out.print("When accessible is false : ");
            long totalTime = 0;
            for (int j = 0; j < 10; j++) {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 10000000; i++) {
                    method.invoke(a);
                }
                long endTime=System.currentTimeMillis();
                System.out.print((endTime-startTime)+"ms ");
                totalTime+=(endTime-startTime);
            }
            System.out.print("average:"+totalTime/10);
            System.out.println();

            System.out.print("When accessible is true : ");
            method.setAccessible(true);
            totalTime = 0;
            for (int j = 0; j < 10; j++) {
                long startTime = System.currentTimeMillis();
                for (int i = 0; i < 10000000; i++) {
                    method.invoke(a);
                }
                long endTime=System.currentTimeMillis();
                System.out.print((endTime-startTime)+"ms ");
                totalTime+=(endTime-startTime);
            }
            System.out.print("average:"+totalTime/10);
            System.out.println();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class ClassA {
    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}