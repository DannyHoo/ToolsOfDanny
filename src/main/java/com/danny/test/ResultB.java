package com.danny.test;

/**
 * @author huyuyang@lxfintech.com
 * @Title: ResultB
 * @Copyright: Copyright (c) 2016
 * @Description: B模块的业务处理结果
 * @Company: lxjr.com
 * @Created on 2017-01-20 18:07:13
 */
public class ResultB<T> {
    private Boolean businessResult;
    private T businessObject = null;
    private String resultCodeMsg = null;

    public Boolean getBusinessResult() {
        return businessResult;
    }

    public ResultB setBusinessResult(Boolean businessResult) {
        this.businessResult = businessResult;
        return this;
    }

    public T getBusinessObject() {
        return businessObject;
    }

    public ResultB setBusinessObject(T businessObject) {
        this.businessObject = businessObject;
        return this;
    }

    public String getResultCodeMsg() {
        return resultCodeMsg;
    }

    public ResultB setResultCodeMsg(String resultCodeMsg) {
        this.resultCodeMsg = resultCodeMsg;
        return this;
    }
}
