package com.base.common.annotation;


import java.lang.annotation.*;

/**
 * @author yyc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface RequestLog {

    String value() default "";

}
