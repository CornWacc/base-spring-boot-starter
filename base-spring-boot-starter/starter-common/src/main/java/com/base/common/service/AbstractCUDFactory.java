package com.base.common.service;


import com.base.common.service.BaseOrder;
import com.base.common.strategy.BaseCUDInterface;
import com.base.common.strategy.CUDOrder;

/**
 * @author yyc
 * @apiNote 通用CUD工厂基类
 * */
public abstract class AbstractCUDFactory<O extends CUDOrder> {

    protected final String CREATE_CODE = "CREATE";

    protected final String UPDATE_CODE = "UPDATE";

    protected final String DELETE_CODE = "DELETE";

    public abstract BaseCUDInterface createStrategy(O order);
}
