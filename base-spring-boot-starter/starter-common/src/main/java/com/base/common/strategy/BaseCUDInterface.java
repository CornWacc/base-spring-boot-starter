package com.base.common.strategy;

import com.base.common.service.BaseResult;

/**
 * @author yyc
 * @apiNote 基础策略执行类
 * */
public interface BaseCUDInterface<O extends CUDOrder,R extends BaseResult> {

    R execute(O order);
}
