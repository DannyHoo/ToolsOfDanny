package com.danny.test;

import java.util.Date;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ResultA
 * @Copyright: Copyright (c) 2016
 * @Description: A模块的业务处理结果
 * @Company: lxjr.com
 * @Created on 2017-01-20 18:07:07
 */
public class ResultA<T> {
    private Boolean businessResult;
    private T businessObject = null;
    private String resultCodeMsg = null;
    private ResultEnum resultEnum;

    public Boolean getBusinessResult() {
        return businessResult;
    }

    public ResultA setBusinessResult(Boolean businessResult) {
        this.businessResult = businessResult;
        return this;
    }

    public T getBusinessObject() {
        return businessObject;
    }

    public ResultA setBusinessObject(T businessObject) {
        this.businessObject = businessObject;
        return this;
    }

    public String getResultCodeMsg() {
        return resultCodeMsg;
    }

    public ResultA setResultCodeMsg(String resultCodeMsg) {
        this.resultCodeMsg = resultCodeMsg;
        return this;
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

    public ResultA setResultEnum(ResultEnum resultEnum) {
        this.resultEnum = resultEnum;
        return this;
    }


    public static void main(String[] args) {
        Date date = new Date();
        for (int i=0;i<200;i++){
            System.out.println("{\"beginTime\":\""+(date.getTime()/1000*1000+i*1000)+ "\", \"callDuration\": \"102\", \"callType\": \"主叫\", \"otherNum\": \"18468052026\", \"homeArea\": \"北京\", \"landType\": \"国内长途\", \"totalFee\": \"0.00\"},");
        }

    }
}
