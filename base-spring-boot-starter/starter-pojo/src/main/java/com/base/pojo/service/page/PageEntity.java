package com.base.pojo.service.page;

import com.base.pojo.service.Base;

/**
 * @author yyc
 * @apiNote 分页实体
 * @createTime 2020/4/6
 */
public class PageEntity extends Base {

    private static final long serialVersionUID = 1839213217457599225L;

    private Integer pageNum;

    private Integer pageSize;

    public PageEntity(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

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
