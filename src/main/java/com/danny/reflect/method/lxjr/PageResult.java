package com.danny.reflect.method.lxjr;

import java.io.Serializable;
import java.util.List;

/**
 * @author huyuyang@lxfintech.com
 * @Title: PageResult
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-01-22 09:28:12
 */
public class PageResult<B> implements Serializable {
    private static final long serialVersionUID = 1813397521769232759L;
    protected List<B> resultList = null;
    protected long totalCount;
    protected int totalPage;

    public List<B> getResultList() {
        return resultList;
    }

    public void setResultList(List<B> resultList) {
        this.resultList = resultList;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
