package com.base.common.annotation;



import com.base.common.enums.CudTypeEnum;

import java.lang.annotation.*;

/**
 * @author yyc
 * @apiNote CUD实体参数校验枚举
 * */
@Target({ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface CudParamsCheck {

    CudTypeEnum[] cudTypes() default {};

    String errorMsg() default "参数不能为空";
}
