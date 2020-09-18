package com.base.common.service.page;

import com.base.common.service.BaseOrder;

/**
 * @author yyc
 * @apiNote 分页入参
 * @createTime 2020/4/6
 */
public class PageOrder extends BaseOrder {

    private static final long serialVersionUID = -8858730947424353429L;

    private PageEntity pageEntity;

    public PageEntity getPageEntity() {
        return pageEntity;
    }

    public void setPageEntity(PageEntity pageEntity) {
        this.pageEntity = pageEntity;
    }
}
