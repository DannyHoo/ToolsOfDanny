package com.danny.tools.collection;

/**
 * @author huyuyang@lxfintech.com
 * @Title: IteratorUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-16 14:51:42
 */
public class IteratorUtils {

    public static<T> int getIterableSize(Iterable<T> iterable){
        java.util.Iterator<T> iterator=iterable.iterator();
        int count=0;
        while(iterator.hasNext()){
            count++;
            iterator.next();
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
