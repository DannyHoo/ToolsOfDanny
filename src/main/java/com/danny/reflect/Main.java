package com.danny.reflect;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Main
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-05-08 18:29:56
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        System.out.println(getInvokeStatusStr(integerList));

        System.out.println(getHousingFundBaseAmt(null,BigDecimal.valueOf(5102)));
        BigDecimal bigDecimal = new BigDecimal("10.030");
        BigDecimal bigDecimal1=new BigDecimal("10.0300");
        System.out.println(BigDecimal.ZERO.compareTo(bigDecimal));

        List<Person> personList = new ArrayList<>();
        System.out.println(personList.getClass());
        GetTClass getTClass = new GetTClass();
        Object object = new Object();
        Person person = new Person();
        getTClass.getTClass(person);
        System.out.println(person.getClass());

    }

    private static String getInvokeStatusStr(List<Integer> invokeStatusList) {
        StringBuffer stringBuffer=new StringBuffer("(");
        for (int i=0;i<invokeStatusList.size();i++){
            stringBuffer.append(i);
            if (i<invokeStatusList.size()-1){
                stringBuffer.append(",");
            }
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    private static BigDecimal getHousingFundBaseAmt(BigDecimal pay_base, BigDecimal trading_amt) {
        if (pay_base!=null && (BigDecimal.ZERO.compareTo(pay_base)==-1)){
            return pay_base;
        }
        //如果获得的基数为空或为0，则根据缴纳金额计算缴纳基数，默认比例为12%+12%=24%
        pay_base=trading_amt.divide(new BigDecimal("0.24"),BigDecimal.ROUND_HALF_UP);
        return pay_base;
    }
}
