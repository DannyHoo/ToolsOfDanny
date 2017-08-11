package com.danny.tools.date;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author huyuyang@lxfintech.com
 * @Title: DateUtils
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-12 17:58:52
 */
public class DateUtils {

    public static String getNextMonthDate(String date) {
        String resultString;
        try {
            if (StringUtils.isEmpty(date)) {
                return getDate();
            }
            Calendar cal = Calendar.getInstance();
            java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
            cal.add(Calendar.MONTH, 1);
            int day = Integer.parseInt(StringUtils.substring(date, StringUtils.lastIndexOf(date, "-") + 1, date.length()));
            cal.set(Calendar.DATE, day);
            String lastMonthStart = format.format(cal.getTime());//上月开始
            cal.clear();
            resultString = lastMonthStart;
        } catch (NumberFormatException e) {
            return getDate();
        }
        return resultString;
    }

    public static String getPreMonthDate(String date) {
        String resultString;
        try {
            if (StringUtils.isEmpty(date)) {
                return getDate();
            }
            Calendar cal = Calendar.getInstance();
            java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
            cal.add(Calendar.MONTH, -1);
            int day = Integer.parseInt(StringUtils.substring(date, StringUtils.lastIndexOf(date, "-") + 1, date.length()));
            cal.set(Calendar.DATE, day);
            String lastMonthStart = format.format(cal.getTime());//上月开始
            cal.clear();
            resultString = lastMonthStart;
        } catch (NumberFormatException e) {
            return getDate();
        }
        return resultString;
    }

    private static String getDate() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }

    /**
     * 获取下个月的今天
     * @param dateTime
     * @return
     */
    public static Date getNextMonthToday(Date dateTime){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String date=df.format(dateTime);
        Date result=new Date();
        Calendar cal = Calendar.getInstance();
        try {
            if (StringUtils.isEmpty(date)) {
                return new Date();
            }
            java.text.DateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
            cal.add(Calendar.MONTH, 1);
            int day = Integer.parseInt(StringUtils.substring(date, StringUtils.lastIndexOf(date, "-") + 1, date.length()));
            cal.set(Calendar.DATE, day);
            result=cal.getTime();
        } catch (NumberFormatException e) {
            return result;
        }
        return result;
    }

    public void convertStrToDate(String strDate){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式

    }

    public static void main(String[] args) {
        String date = getDate();
        String nextDate = getNextMonthDate(date);
        String preDate=getPreMonthDate(date);
        System.out.println("start=" + preDate);
        System.out.println("end=" + nextDate);
        System.out.println(getNextMonthToday(new Date()));
        System.out.println();
    }

}
