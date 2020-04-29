package com.base.pojo.service.page;

import com.base.pojo.service.Base;

/**
 * @author yyc
 * @apiNote
 * @createTime 2020/4/20
 */
public class PageAo extends Base {

    private static final Integer DEFAULT_PAGE_NUM = 1;

    private static final Integer DEFAULT_PAGE_SIZE = 10;

    private Integer pageNum = DEFAULT_PAGE_NUM;

    private Integer pageSize = DEFAULT_PAGE_SIZE;

    private String keyWord;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public PageAo() {
    }

    public PageAo(Integer pageNum, Integer pageSize) {
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
