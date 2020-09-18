package com.base.common.service.page;

import com.base.common.service.Base;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author yyc
 * @apiNote
 * @createTime 2020/4/20
 */
public class PageResult extends Base {

    /**
     * 分页参数
     * */
    private PageInfo pageInfo;

    /**
     * 分页返回的列表
     * */
    private List pageList;

    /**
     * 总条数
     * */
    private long total;

    /**
     * 当前页
     * */
    private Integer pageNum;

    /**
     * 当前页面大小
     * */
    private Integer pageSize;

    public PageResult(){

    }

    public PageResult(PageInfo pageInfo, List pageList) {
        this.pageList = pageList;
        this.total = pageInfo.getTotal();
        this.pageNum = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();

    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List getPageList() {
        return pageList;
    }

    public void setPageList(List pageList) {
        this.pageList = pageList;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
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
