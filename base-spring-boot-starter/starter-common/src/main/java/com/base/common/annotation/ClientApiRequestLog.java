package com.base.common.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
public @interface ClientApiRequestLog {

    String msg();

}
