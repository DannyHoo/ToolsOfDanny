package com.danny.reflect.method.lxjr;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author huyuyang@lxfintech.com
 * @Title: CreditAccountResult
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-22 09:29:17
 */
public class CreditAccountResult<B>  {
    /** 业务处理状态 */
    private CreditAccountResultStatusEnum businessResult = null;
    /** 业务结果 */
    protected B businessObject = null;
    /** 可以放置exception的msg信息 */
    protected String resultCodeMsg = null;

    public boolean isSuccess() {
        return businessResult == CreditAccountResultStatusEnum.SUCCESS;
    }

    public CreditAccountResultStatusEnum getBusinessResult() {
        return businessResult;
    }

    public void setBusinessResult(CreditAccountResultStatusEnum businessResult) {
        this.businessResult = businessResult;
    }

    public B getBusinessObject() {
        return businessObject;
    }

    public void setBusinessObject(B businessObject) {
        this.businessObject = businessObject;
    }

    public String getResultCodeMsg() {
        return resultCodeMsg;
    }

    public void setResultCodeMsg(String resultCodeMsg) {
        this.resultCodeMsg = resultCodeMsg;
    }
}
