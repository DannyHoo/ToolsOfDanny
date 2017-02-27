package com.danny.tools.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ListUtilsTest
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2016-12-06 14:11:05
 */
public class ListUtilsTest {

    @Test
    public void testGoThroughByListSize(){
        List<Object> stringList=new ArrayList<Object>();
        stringList.add("宋爽爽");
        stringList.add("danny");
        stringList.add("dannyhoo");
        stringList.add("胡玉洋");
        ListUtils.goThroughByListSize(stringList);
    }

    @Test
    public void testGetObject(){
        Object object=getObject();
        Assert.assertNotNull(object);
    }

    public static Object getObject(){
        Object object=new Object();
        int i=1/0;
        return object;
    }

}
