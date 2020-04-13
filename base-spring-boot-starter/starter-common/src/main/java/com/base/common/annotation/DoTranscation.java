package com.base.common.annotation;

import java.lang.annotation.*;

/**
 * @author yyc
 * @apiNote 事物标志注解
 * @createTime 2020/3/31
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface DoTranscation {
}
