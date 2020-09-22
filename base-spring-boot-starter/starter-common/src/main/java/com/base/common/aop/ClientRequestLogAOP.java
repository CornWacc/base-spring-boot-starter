package com.base.common.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.base.common.annotation.ClientApiRequestLog;
import com.base.common.service.BaseResult;
import org.apache.commons.pool2.BaseObject;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class ClientRequestLogAOP {

    private static final Logger log = LoggerFactory.getLogger(ClientRequestLogAOP.class);

    @Pointcut("@annotation(com.base.common.annotation.ClientApiRequestLog)")
    public void point() {
    }

    @Around("point() && @annotation(requestLog)")
    public BaseResult doAround(ProceedingJoinPoint joinPoint,ClientApiRequestLog requestLog) throws Throwable {

        log.info(requestLog.msg()+"请求入参:{}",JSON.toJSONString(joinPoint.getArgs()));
        BaseResult object = (BaseResult) joinPoint.proceed();
        log.info(requestLog.msg()+"请求回调:{}", JSON.toJSONString(object, SerializerFeature.WriteMapNullValue));
        return object;
    }

}
