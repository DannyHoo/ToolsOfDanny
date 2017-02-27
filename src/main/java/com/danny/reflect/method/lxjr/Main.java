package com.danny.reflect.method.lxjr;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Main
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-22 09:32:21
 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Main executor = new Main();
        PageResult<Person> personPageResult = executor.getPersonPageResult();
        CreditAccountResult<PageResult<Person>> pageResultCreditAccountResult =executor.getPageResultCreditAccountResult(personPageResult);
        Map map=executor.getPageResult(pageResultCreditAccountResult,Person.class);
        System.out.println();
    }


    private <T,P> Map<String, Object> getPageResult(P pageResult, Class<T> targetClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<String, Object> map = new HashMap<String, Object>();
        List<T> dataList = new ArrayList<T>();
        long total = 0;

        pageResult.getClass().getDeclaredMethod("getBusinessObject");
        System.out.println(pageResult.getClass().getName());
        Method[] methods=pageResult.getClass().getDeclaredMethods();
        Method isSuccessMethod=pageResult.getClass().getDeclaredMethod("isSuccess");
        isSuccessMethod.setAccessible(true);
        Method getBusinessObjectMethod=pageResult.getClass().getDeclaredMethod("getBusinessObject");
        getBusinessObjectMethod.setAccessible(true);
        Boolean isSuccess=(Boolean)isSuccessMethod.invoke(pageResult);
        PageResult<T> t=(PageResult<T>)getBusinessObjectMethod.invoke(pageResult);
        if (isSuccess) {
            dataList = t.getResultList();
            total = t.getTotalCount();
        }

        JSONArray json = JSONArray.parseArray(JSON.toJSONStringWithDateFormat(dataList, "yyyy-MM-dd hh:mm:ss"));
        map.put("rows", json);
        map.put("total", total);
        return map;
    }


    /*private <T> Map<String,Object> getPageResult(CreditAccountResult<PageResult<T>> pageResult, Class<T> targetClass) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<T> dataList = new ArrayList<T>();
        long total = 0;
        if(pageResult.isSuccess()) {
            dataList = pageResult.getBusinessObject().getResultList();
            total = pageResult.getBusinessObject().getTotalCount();
        }
        JSONArray json=JSONArray.parseArray(JSON.toJSONStringWithDateFormat(dataList,"yyyy-MM-dd hh:mm:ss"));
        map.put("rows", json);
        map.put("total", total);
        return map;
    }*/

    private PageResult<Person> getPersonPageResult() {
        PageResult<Person> personPageResult = new PageResult<Person>();
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"Danny1"));
        personList.add(new Person(2,"Danny2"));
        personList.add(new Person(3,"Danny3"));
        personPageResult.setTotalPage(10);
        personPageResult.setTotalCount(100);
        personPageResult.setResultList(personList);
        return personPageResult;
    }

    private CreditAccountResult<PageResult<Person>> getPageResultCreditAccountResult(PageResult<Person> personPageResult) {
        CreditAccountResult<PageResult<Person>> pageResultCreditAccountResult = new CreditAccountResult<PageResult<Person>>();
        pageResultCreditAccountResult.setBusinessResult(CreditAccountResultStatusEnum.SUCCESS);
        pageResultCreditAccountResult.setResultCodeMsg(CreditAccountResultStatusEnum.SUCCESS.getDescription());
        pageResultCreditAccountResult.setBusinessObject(personPageResult);
        return pageResultCreditAccountResult;
    }
}
