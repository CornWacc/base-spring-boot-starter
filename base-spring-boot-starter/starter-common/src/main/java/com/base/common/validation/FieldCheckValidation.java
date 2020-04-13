package com.base.common.validation;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author yyc
 * @apiNote 参数校验
 * @createTime 2020/4/6
 */
public class FieldCheckValidation implements ConstraintValidator<NotBlank,String> {

    private String errorMsg;

    @Override
    public void initialize(NotBlank constraintAnnotation) {
        this.errorMsg = constraintAnnotation.errorMsg();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(StringUtils.isBlank(s)){
            constraintValidatorContext.buildConstraintViolationWithTemplate(errorMsg).addConstraintViolation();
            return false;
        }
        return true;
    }
}
