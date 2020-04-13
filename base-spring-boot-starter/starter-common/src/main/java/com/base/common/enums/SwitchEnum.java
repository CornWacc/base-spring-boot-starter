package com.base.common.enums;

/**
 * @author yyc
 * @apiNote 开启状态枚举
 * @createTime 2020/3/31
 */
public enum SwitchEnum {

    OPEN("OPEN","开"),
    CLOSE("CLOSE","关");

    private final String code;

    private final String msg;

    SwitchEnum(String code, String msg) {
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
