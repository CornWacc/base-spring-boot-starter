package com.base.common.enums;

/**
 * @author yyc
 * @apiNote YN枚举
 * @createTime 2020/4/6
 */
public enum YNEnum {

    Y("Y","是"),

    N("N","不是");

    private final String code;

    private final String msg;

    YNEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
