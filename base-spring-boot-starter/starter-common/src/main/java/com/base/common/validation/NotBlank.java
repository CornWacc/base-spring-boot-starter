package com.base.common.validation;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * @author yyc
 * @apiNote
 * @createTime 2020/4/6
 */
@Constraint(validatedBy = FieldCheckValidation.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@Documented
public @interface NotBlank {

    String errorMsg() default "参数不能为空";

}
