package com.danny.tools.object;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: JudgeNull
 * @Copyright: Copyright (c) 2016
 * @Description: 判空
 * @Company: lxjr.com
 * @Created on 2017-02-22 14:16:43
 */
public class JudgeNull {
    /**
     * 判断参数是否为空
     * */
    protected boolean hasNull(Object... objects) {
        if (objects == null) {
            return true;
        }
        for (Object p : objects) {
            if (p==null|| StringUtils.isBlank(String.valueOf(p))) {
                return  true;
            }
        }
        return false;
    }
    /*
    * 判断对象中是否出现有空
    * */
    public  boolean hasNullObj(Object obj,String... ignore) {
        if (obj == null) {
            return true;
        } else {
            List ignoreList = null;
            if (ignore != null) {
                ignoreList = Arrays.asList(ignore);
            }

            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (ignoreList != null && ignoreList.contains(f.getName())) {
                    continue;
                }
                try {
                    if (f.get(obj) == null || StringUtils.isBlank(ObjectUtils.identityToString(f.get(obj)))
                            ||  StringUtils.isBlank(String.valueOf(f.get(obj)))) { //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    }
    /**
     * 判断对象中是否有空的参数,并将空的参数返回
     * @return
     * */
    public  String hasNullObjWithReturn(Object obj,String... ignore) {
        if (obj == null) {
            return obj.getClass().getName();
        } else {
            List ignoreList = null;
            if (ignore != null) {
                ignoreList = Arrays.asList(ignore);
            }

            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (ignoreList != null && ignoreList.contains(f.getName())) {
                    continue;
                }
                try {
                    if (f.get(obj) == null || StringUtils.isBlank(ObjectUtils.identityToString(f.get(obj)))
                            ||  StringUtils.isBlank(String.valueOf(f.get(obj)))) { //判断字段是否为空，并且对象属性中的基本都会转为对象类型来判断
                        return f.getDeclaringClass().getName()+"."+f.getName();
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}
