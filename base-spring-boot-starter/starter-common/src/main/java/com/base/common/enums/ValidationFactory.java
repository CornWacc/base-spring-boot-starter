package com.base.common.enums;

import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 * @author : fjl
 * @version : 1.0
 * @date : 2020/4/14 13:52
 */
public enum ValidationFactory {

    INSTANCE {

        final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

        @Override
        public ValidatorFactory getValidatorFactory() {
            return validatorFactory;
        }
    };

    public abstract ValidatorFactory getValidatorFactory();

}
