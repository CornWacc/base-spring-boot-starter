package com.base.pojo.service;

import com.base.common.enums.StatusEnum;

import java.io.Serializable;

/**
 * @author yyc
 * @apiNote 基础业务返回参数
 * @createTime 2020/3/31
 */
public class BaseResult extends Base {

    private static final long serialVersionUID = -467694343216012260L;

    /**
     * 执行结果状态
     * */
    private StatusEnum status;

    /**
     * 执行结果文本解释
     * */
    private String msg;

    /**
     * 处理状态码
     * */
    private Integer bizCode;

    public Integer getBizCode() {
        return bizCode;
    }

    public void setBizCode(Integer bizCode) {
        this.bizCode = bizCode;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess(){
        return this.status.getCode() == StatusEnum.SUCCESS.getCode() ? true : false;
    }
}
