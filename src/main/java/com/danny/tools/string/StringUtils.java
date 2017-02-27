package com.danny.tools.string;

/**
 * @author huyuyang@lxfintech.com
 * @Title: StringUtils
 * @Copyright: Copyright (c) 2016
 * @Description: https://my.oschina.net/u/1453975/blog/529521
 * @Company: lxjr.com
 * @Created on 2016-11-28 00:07:01
 */
public class StringUtils {
    public static void main(String[] args) {
        String str = "41150319740118630  唐玄子";
        String[] strs = str.split(" ");
        String idCard = strs[0];
        String name = str.replace(idCard, "");
        System.out.println(getSex("女"));
    }

    private static int getSex(String sex) {
        int sexInt=0;
        if (sex == null || sex == "") {
            return sexInt;//默认未知
        }
        sexInt=sex.equals("男")?1:2;
        return sexInt;
    }

}

