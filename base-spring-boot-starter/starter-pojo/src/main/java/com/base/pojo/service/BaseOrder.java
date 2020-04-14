package com.base.pojo.service;

import com.base.common.enums.ValidationFactory;
import com.base.common.error.BizError;
import com.base.common.util.DateUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;
import java.util.Date;
import java.util.Set;

/**
 * @author yyc
 * @apiNote 基础类型入参
 * @createTime 2020/3/31
 */
public class BaseOrder extends Base {

    private static final long serialVersionUID = -2710470052282474938L;

    /**
     * 业务序列号
     */
    private String bizNo;

    public String getBizNo() {
        return bizNo;
    }

    public void setBizNo(String bizNo) {
        this.bizNo = bizNo;
    }

    /**
     * 生成序列号
     *
     * @param bizName 业务名称
     */
    public String makeBizNo(String bizName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bizName);
        stringBuilder.append(DateUtils.dateForMateForConnect(new Date()));
        return stringBuilder.toString();
    }

    /**
     * 校验序列号
     */
    public void checkBizNo() {
        if (StringUtils.isBlank(getBizNo())) {
            throw new BizError("服务序列号不能为空!");
        }
    }

    public void check() {

        ValidatorFactory validatorFactory = ValidationFactory.INSTANCE.getValidatorFactory();
        Set<ConstraintViolation<BaseOrder>> messages = validatorFactory.getValidator().validate(this);
        if (null != messages && !messages.isEmpty()) {
            for (ConstraintViolation<BaseOrder> message : messages) {
                throw new RuntimeException(message.getMessage());
            }
        }
    }

}
