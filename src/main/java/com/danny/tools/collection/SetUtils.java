package com.danny.tools.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author huyuyang@lxfintech.com
 * @Title: SetUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-12-06 00:06:39
 */
public class SetUtils<T> {

    /*================================Set遍历-begin================================*/
    /**
     * 通过迭代遍历
     */
    public void goThroughByIterator(Set<Object> set){
        Iterator<Object> it=set.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }

    /**
     * 通过For循环遍历
     */
    public void goThroughByForeach(Set<Object> set){
        for (Object obj:set) {
            System.out.println(obj);
        }
    }
    /*================================Set遍历-end================================*/


}
