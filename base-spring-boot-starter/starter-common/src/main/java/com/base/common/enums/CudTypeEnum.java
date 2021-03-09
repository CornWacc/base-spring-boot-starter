package com.base.common.enums;

public enum CudTypeEnum  {

    CREATE("CREATE","创建"),
    UPDATE("UPDATE","更新"),
    DELETE("DELETE","删除");

    private final String code;

    private final String msg;


    CudTypeEnum(String code, String msg) {
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
