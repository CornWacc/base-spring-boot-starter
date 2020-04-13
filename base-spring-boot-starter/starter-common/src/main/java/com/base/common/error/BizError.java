package com.base.common.error;

/**
 * @author yyc
 * @apiNote 基础异常类
 * @createTime 2020/3/31
 */
public class BizError extends RuntimeException{

    /**
     * 成功状态码
     * */
    private static final Integer SUCCESS_CODE = 200;

    /**
     * 错误状态码
     * */
    private static final Integer ERROR_CODE = 500;

    /**
     * 后端异常状态码
     * */
    private static final Integer BACKSTAGE_ERROR_CODE = 501;


    /**
     * 状态码
     * */
    private Integer code;

    public BizError() {
        super();
    }

    /**
     * 构建一个<code>BizError.java</code>
     * msg为自定义信息
     * 此方法适用于 直接抛出自己定义的信息
     *
     * @param msg
     */
    public BizError(String msg) {
        super(msg);
    }

    public BizError(String message, Throwable cause) {
        super(message, cause);
    }

    public BizError(Throwable cause) {
        super(cause);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
