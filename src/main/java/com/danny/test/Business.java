package com.danny.test;

import java.lang.reflect.Field;

/**
 * @author huyuyang@lxfintech.com
 * @Title: My
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-20 18:06:46
 */
public class Business {

    public static void main(String[] args) {
        ResultA resultA = new ResultA().setBusinessResult(true).setResultCodeMsg("ResultCodeMsgA").setBusinessObject(new String("hello!Temp")).setResultEnum(ResultEnum.RESULT_A);
        ResultB resultB = new ResultB().setBusinessResult(false).setResultCodeMsg("ResultCodeMsgeB").setBusinessObject(new String("hello!B"));
        /*new Main().getResult(resultA);
        new Main().getResult(resultB);
        new Main().getResult(resultC);*/
        new Business().reflect(resultA);
    }

    /**
     * 参数传入
     */
    public <T> void getResult(T t) {
        Class c = t.getClass();
        Field[] fields = c.getDeclaredFields();
        System.out.println("fields.length" + fields.length);
        for (Field field : fields) {
            if (field.getName().equals("businessResult")) {
                try {
                    System.out.println(field.getName() + ":" + field.get(t));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void reflect(Object obj) {
        if (obj == null) return;
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int j = 0; j < fields.length; j++) {
            fields[j].setAccessible(true);
            if (fields[j].getType().getName().equals(
                    java.lang.String.class.getName())) {
                try {
                    System.out.println(fields[j].getName() + "：" + fields[j].get(obj));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else if (fields[j].getType().getName().equals(
                    java.lang.Integer.class.getName())
                    || fields[j].getType().getName().equals("int")) {
                try {
                    System.out.println(fields[j].getName() + "：" +fields[j].getInt(obj));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }else if (fields[j].getType().getName().equals(
                    java.lang.Object.class.getName())) {
                try {
                    System.out.println(fields[j].getName() + "：" +fields[j].get(obj));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }else if (fields[j].getType().getName().equals(
                    java.lang.Boolean.class.getName())) {
                try {
                    System.out.println(fields[j].getName() + "：" +fields[j].get(obj));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }else if (fields[j].getType().getName().equals("com.danny.test.ResultEnum")) {
                try {
                    ResultEnum resultEnum=(ResultEnum)fields[j].get(obj);
                    System.out.println(fields[j].getName() + "：" +fields[j].get(obj));
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
