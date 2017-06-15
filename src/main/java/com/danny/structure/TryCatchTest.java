package com.danny.structure;

/**
 * @author huyuyang@lxfintech.com
 * @Title: TryCatchTest
 * @Copyright: Copyright (c) 2016
 * @Description: 执行catch之后会不会继续执行下面的代码
 * @Company: lxjr.com
 * @Created on 2017-02-15 11:14:02
 */
public class TryCatchTest {

    public static void main(String[] args) {
        s();
    }

    public static void s() {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------==========--------");

    }
}
