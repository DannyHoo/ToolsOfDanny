package com.danny.structure;

/**
 * @author huyuyang@lxfintech.com
 * @Title: TryCatchFinallyTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-02-15 11:14:02
 */
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        String str=new TryCatchFinallyTest().getHelloWorld();
        System.out.println(str);
    }

    public String getHelloWorld(){
        try {
            int i=1/0;
            return "hello world";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        } finally {
            System.out.printf("释放锁");
            return "finally";
        }
    }
}
