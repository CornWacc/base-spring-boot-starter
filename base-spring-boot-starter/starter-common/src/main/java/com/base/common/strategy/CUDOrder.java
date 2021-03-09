package com.base.common.strategy;


import com.base.common.annotation.CudParamsCheck;
import com.base.common.enums.CudTypeEnum;
import com.base.common.error.BizError;
import com.base.common.service.BaseOrder;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class CUDOrder extends BaseOrder {

    private static final String METHOD_PREFIX = "get";

    protected CudTypeEnum cudType;

    public CudTypeEnum getCudType() {
        return cudType;
    }

    public void setCudType(CudTypeEnum cudType) {
        this.cudType = cudType;
    }

    public void checkCUDParams() {
        Class aClass = this.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            CudParamsCheck cudParamsCheck = field.getAnnotation(CudParamsCheck.class);
            if (!ObjectUtils.isEmpty(cudParamsCheck)) {
                List<CudTypeEnum> arrayList = Arrays.asList(cudParamsCheck.cudTypes());
                if (arrayList.contains(this.cudType)) {
                    try{
                        paramsCheck(field, aClass, cudParamsCheck.errorMsg());
                    }catch (Exception e){
                        throw new BizError("参数校验失败!");
                    }
                }
            }
        }
    }

    private void paramsCheck(Field field, Class aClass, String errorMsg) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        if (String.class.equals(field.getType())) {
            String result = (String) aClass.getDeclaredMethod(joinMethodName(field.getName())).invoke(this);
            if (StringUtils.isEmpty(result)) {
                throw new BizError(errorMsg);
            }
        } else {
            Object result = aClass.getDeclaredMethod(joinMethodName(field.getName())).invoke(this);
            if (ObjectUtils.isEmpty(result)) {
                throw new BizError(errorMsg);
            }
        }
    }

    private String joinMethodName(String paramName) {
        if (StringUtils.isEmpty(paramName)) {
            throw new BizError("方法名称拼接失败!");
        }
        String firstChar = String.valueOf(paramName.charAt(0)).toUpperCase();
        String subString = paramName.substring(1);
        firstChar += subString;
        return METHOD_PREFIX+firstChar;
    }
}


