package com.base.common.annotation;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.*;


/**
 * @author yyc
 * @apiNote 基础启动注解
 * */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
public @interface Runner {

    String port() default "8080";

    String active() default "dev";

    /**
     * 这是扫描mapping的路径
     */
    String mappingPath() default "/mapping/**.xml";
    String javaVersion() default "1.8";
}
