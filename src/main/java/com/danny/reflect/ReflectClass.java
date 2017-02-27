package com.danny.reflect;

import java.lang.reflect.Field;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ReflectClass
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-20 18:42:05
 */
public class ReflectClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(0);
        p.setName("张三");
        reflect(p);
    }

    public static void reflect(Object obj) {
        if (obj == null) return;
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);//true:反射的对象在使用时取消Java语言访问检查;false:指示反射的对象应该实施Java语言访问检查
            // 字段名
            System.out.print(fields[j].getName() + ",");
            // 字段值
            if (fields[j].getType().getName().equals(
                    java.lang.String.class.getName())) {
                // String type
                try {
                    System.out.print(fields[j].get(obj));
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else if (fields[j].getType().getName().equals(
                    java.lang.Integer.class.getName())
                    || fields[j].getType().getName().equals("int")) {
                // Integer type
                try {
                    System.out.println(fields[j].getInt(obj));
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            // 其他类型。。。
        }
        System.out.println();
    }
}


class Person {
    private int id;
    private String name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}