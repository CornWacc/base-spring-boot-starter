package com.base.pojo.service.page;

import com.base.pojo.service.Base;

/**
 * @author yyc
 * @apiNote
 * @createTime 2020/4/20
 */
public class PageAo extends Base {

    private Integer pageNum;

    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
