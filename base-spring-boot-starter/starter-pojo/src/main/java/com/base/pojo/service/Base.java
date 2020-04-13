package com.base.pojo.service;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author yyc
 * @apiNote 基类
 * @createTime 2020/4/2
 */
public class Base implements Serializable {

    private static final long serialVersionUID = 1637132783277111683L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
