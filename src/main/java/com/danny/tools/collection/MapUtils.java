package com.danny.tools.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @Title: MapUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-11-27 22:52:48
 * @author huyuyang@lxfintech.com
 */
public class MapUtils<T> {

    /*================================Map遍历-begin================================*/

    /**
     * 通过Map的entrySet来循环遍历
     * @param map
     */
    public void goThroughByEntries(Map<String,Object> map){
        for(Map.Entry<String,Object> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
    }

    /**
     * 通过Map的keySet来循环遍历
     * 该方法比entrySet遍历在性能上稍好（快了10%），而且代码更加干净。
     * @param map
     */
    public void goThroughByKeySet(Map<String,Object> map){
        for(String str:map.keySet()){
            Object object=map.get(str);//注意如果在这里取value效率会低一些，遍历完之后又重新hash查找了一遍
            System.out.println("key="+str);
        }
    }

    /**
     * 通过Map的values来循环遍历
     * 该方法比entrySet遍历在性能上稍好（快了10%），而且代码更加干净。
     * @param map
     */
    public void goThroughByValues(Map<String,Object> map){
        for(Object object:map.values()){
            System.out.println("value="+object);
        }
    }

    /**
     * 通过迭代器遍历
     * @param map
     */
    public void goThroughByIterator(Map<String,Object> map){
        Iterator<Map.Entry<String,Object>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Object> entry=iterator.next();
            System.out.println("key="+entry.getKey()+"value="+entry.getValue());
        }
    }
    /*================================Map遍历-end================================*/

}
