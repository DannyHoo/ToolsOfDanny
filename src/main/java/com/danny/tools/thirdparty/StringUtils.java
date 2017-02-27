package com.danny.tools.thirdparty;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author huyuyang@lxfintech.com
 * @Title: StringUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-02-27 10:45:02
 */
public class StringUtils {

    public static void main(String[] args) {
        System.out.println(getRandomString(6));
        System.out.println(getRandomNumeric(6));
        System.out.println(getRandomAlphanumeric(6));
    }

    public static String getRandomString(int length){
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String getRandomNumeric(int length){
        return RandomStringUtils.randomNumeric(length);
    }

    public static String getRandomAlphanumeric(int length){
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
