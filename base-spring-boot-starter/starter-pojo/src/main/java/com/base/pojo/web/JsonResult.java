package com.base.pojo.web;

import com.base.common.enums.StatusEnum;
import com.base.common.service.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author yyc
 * @apiNote 通用返回json类
 */
public class JsonResult {

    private static final Logger log = LoggerFactory.getLogger(JsonResult.class);

    /**
     * 返回实体
     * */
    private Object data;

    /**
     * 返回信息
     * */
    private String msg;

    /**
     * 响应码
     * */
    private Integer code;

    /**
     * 是否执行成功
     * */
    private Boolean success;

    public JsonResult(Object o){
        if(o instanceof BaseResult){
            BaseResult baseRes = (BaseResult) o;
            if(checkSuccess(baseRes.getBizCode(),baseRes)){
                this.msg = "执行成功";
                this.success = true;
                this.code = StatusEnum.SUCCESS.getBizCode();
            }else{
                this.msg = baseRes.getMsg();
                this.success = false;
                this.code = StatusEnum.FAIL.getBizCode();
            }
        }
        this.data = o;
    }

    public JsonResult(Object o,String msg){
        if(o instanceof BaseResult){
            BaseResult baseRes = (BaseResult) o;
            if(checkSuccess(baseRes.getBizCode(),baseRes)){
                this.msg = msg;
                this.success = true;
                this.code = StatusEnum.SUCCESS.getBizCode();
            }else{
                this.msg = baseRes.getMsg();
                this.success = false;
                this.code = StatusEnum.FAIL.getBizCode();
            }
        }
        this.data = o;
    }

    public JsonResult(String msg,Boolean success){
        this.msg = msg;
        this.success = success;
        this.code = success ? StatusEnum.SUCCESS.getBizCode() : StatusEnum.FAIL.getBizCode();
    }

    public JsonResult(String msg,Boolean success,Integer code){
        this.msg = msg;
        this.success = success;
        this.code = code;
    }

    private boolean checkSuccess(Integer code,BaseResult res){
        switch (code){
            case 200:
                return true;
            case 401:
                res.setMsg("用户权限异常！");
                return false;
            default:
                return false;
        }
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
