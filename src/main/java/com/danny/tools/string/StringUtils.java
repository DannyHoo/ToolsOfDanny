package com.danny.tools.string;

/**
 * @author huyuyang@lxfintech.com
 * @Title: StringUtils
 * @Copyright: Copyright (c) 2016
 * @Description: https://my.oschina.net/u/1453975/blog/529521
 * @Company: lxjr.com
 * @Created on 2016-11-28 00:07:01
 */
public class StringUtils {
    public static void main(String[] args) {
        String str = "41150319740118630  唐玄子";
        String[] strs = str.split(" ");
        String idCard = strs[0];
        String name = str.replace(idCard, "");
        //System.out.println(getSex("女"));

        String s1="130582************";
        String s2="玉洋";
        System.out.println(s1.substring(0,6));

        String a="{\n" +
                "    \"note\":\"\",\n" +
                "    \"success\":\"true\",\n" +
                "    \"raw_data\":{\n" +
                "        \"members\":{\n" +
                "            \"status\":\"success\",\n" +
                "            \"update_time\":\"2016-11-08 18:00:08\",\n" +
                "            \"request_args\":[\n" +
                "                {\n" +
                "                    \"token\":\"d9e1073aa1ca4d6580df518289fef961\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"env\":\"www\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"transactions\":[\n" +
                "                {\n" +
                "                    \"calls\":[\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"start_time\":\"2016-10-01 14:21:42\",\n" +
                "                            \"init_type\":\"被叫\",\n" +
                "                            \"use_time\":52,\n" +
                "                            \"place\":\"北京\",\n" +
                "                            \"other_cell_phone\":\"18603266252\",\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"subtotal\":0,\n" +
                "                            \"call_type\":\"京津冀\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"start_time\":\"2016-10-01 15:41:13\",\n" +
                "                            \"init_type\":\"被叫\",\n" +
                "                            \"use_time\":71,\n" +
                "                            \"place\":\"北京\",\n" +
                "                            \"other_cell_phone\":\"18832636773\",\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"subtotal\":0,\n" +
                "                            \"call_type\":\"京津冀\"\n" +
                "                        }\n" +

                "                    ],\n" +
                "                    \"transactions\":[\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"total_amt\":18.3,\n" +
                "                            \"plan_amt\":18,\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"bill_cycle\":\"2016-10-01 00:00:00\",\n" +
                "                            \"pay_amt\":null\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"total_amt\":18.8,\n" +
                "                            \"plan_amt\":18,\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"bill_cycle\":\"2016-09-01 00:00:00\",\n" +
                "                            \"pay_amt\":null\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"total_amt\":25.3,\n" +
                "                            \"plan_amt\":18,\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"bill_cycle\":\"2016-08-01 00:00:00\",\n" +
                "                            \"pay_amt\":null\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"total_amt\":20.66,\n" +
                "                            \"plan_amt\":18,\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"bill_cycle\":\"2016-07-01 00:00:00\",\n" +
                "                            \"pay_amt\":null\n" +
                "                        },\n" +
                "                        {\n" +
                "                            \"update_time\":\"2016-11-02 14:24:08\",\n" +
                "                            \"total_amt\":21.76,\n" +
                "                            \"plan_amt\":21.46,\n" +
                "                            \"cell_phone\":\"18730644384\",\n" +
                "                            \"bill_cycle\":\"2016-06-01 00:00:00\",\n" +
                "                            \"pay_amt\":null\n" +
                "                        }\n" +
                "                    ],\n" +

                "            ],\n" +
                "            \"error_code\":31200,\n" +
                "            \"error_msg\":\"请求用户数据成功\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
        System.out.println(a.replace(" ",""));
    }

    private static int getSex(String sex) {
        int sexInt=0;
        if (sex == null || sex == "") {
            return sexInt;//默认未知
        }
        sexInt=sex.equals("男")?1:2;
        return sexInt;
    }

}

