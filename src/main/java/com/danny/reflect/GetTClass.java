package com.danny.reflect;

/**
 * @author huyuyang@lxfintech.com
 * @Title: GetTClass
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-05-08 18:27:57
 */
public class GetTClass {
    public void getTClass(Object object) {
        System.out.println(getClass(object));
    }

    public Class<?> getClass(Object object){
        return object.getClass();
    }
}
