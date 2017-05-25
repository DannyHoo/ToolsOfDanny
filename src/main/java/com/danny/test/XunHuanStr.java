package com.danny.test;

/**
 * @author huyuyang@lxfintech.com
 * @Title: XunHuanStr
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-05-12 18:58:36
 */
public class XunHuanStr {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        long time = 1494673656;
        for (int i = 0; i < 31; i++) {
            stringBuffer.append("        {\n")
                    .append("          \"beginTime\": \"" + (time + i * 10) + "000\",\n")
                    .append("          \"callDuration\": \"102\",\n")
                    .append("          \"callType\": \"主叫\",\n")
                    .append("          \"otherNum\": \"18468052026\",\n")
                    .append("          \"homeArea\": \"北京\",\n")
                    .append("          \"landType\": \"国内长途\",\n")
                    .append("          \"totalFee\": \"0.00\"\n")
                    .append("        }");

            stringBuffer.append(",");
        }
        System.out.println(stringBuffer);
    }
}
