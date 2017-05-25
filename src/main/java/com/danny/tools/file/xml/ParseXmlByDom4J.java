package com.danny.tools.file.xml;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ParseXmlByDom4J
 * @Copyright: Copyright (c) 2016
 * @Description: dom4j解析xml字符串实例
 * http://www.cnblogs.com/macula/archive/2011/07/27/2118003.html
 * @Company: lxjr.com
 * @Created on 2017-04-25 13:55:35
 */
public class ParseXmlByDom4J {
    public static void main(String[] args) {
        Integer i1=100;
        Integer i2=100;
        System.out.println(i1.equals(i2));
        System.out.println(i1==i2);
        Integer i3=200;
        Integer i4=200;
        System.out.println(i3.equals(i4));
        System.out.println(i3==4);

        System.out.println(getMaxAmt("0W～0.2W"));
        System.out.println(getMinAmt("0W～0.2W"));

    }

    /**
     * 获得指定格式（0W～0.2W）的最小金额
     * @param amount
     * @return
     */
    private static BigDecimal getMinAmt(String amount) {
        try {
            String min=amount.substring(0,amount.indexOf("W"));
            return new BigDecimal(min).multiply(BigDecimal.valueOf(10000));
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }

    /**
     * 获得指定格式（0W～0.2W）的最大金额
     * @param amount
     * @return
     */
    private static BigDecimal getMaxAmt(String amount) {
        try {
            String max=amount.substring(amount.indexOf("～")+1,amount.indexOf("W",amount.indexOf("W")+1));
            return new BigDecimal(max).multiply(BigDecimal.valueOf(10000));
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }
}
