package com.danny.tools.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ListUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-12-06 08:34:49
 */
public class ListUtils {

    /*================================List遍历-begin================================*/
    /**
     * 通过List的size属性遍历
     */
    public static void goThroughByListSize(List<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 通过迭代遍历
     */
    public static void goThroughByIterator(List<Object> list) {
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println();
        }
    }

    /**
     * 通过Foreach遍历
     */
    public static void goThroughByForeach(List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    /*================================List遍历-end================================*/


}
