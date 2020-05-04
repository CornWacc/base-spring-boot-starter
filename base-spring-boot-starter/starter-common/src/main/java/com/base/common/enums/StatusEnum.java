package com.base.common.enums;

/**
 * @author yyc
 * @apiNote 状态枚举
 * @createTime 2020/3/31
 */
public enum StatusEnum {

    SUCCESS("SUCCESS","成功",200),
    ERROR("ERROR","失败",500),
    UNAUTHOR("UNAUTHOR","未登录",401),
    ROLEFAIL("ROLEFAIL","权限认证失败",403),
    FAIL("FAIL","系统繁忙",501);

    private String code;

    private String msg;

    private Integer bizCode;

    StatusEnum(String code, String msg, Integer bizCode) {
        this.code = code;
        this.msg = msg;
        this.bizCode = bizCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getBizCode() {
        return bizCode;
    }

    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }
}
