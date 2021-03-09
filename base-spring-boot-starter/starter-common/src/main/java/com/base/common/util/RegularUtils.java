package com.base.common.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yyc
 * @apiNote 通用正则匹配工具类
 */
public class RegularUtils {

    private static final String EMAIL_PATTERN = "^[a-zA-Z_]{0,}[0-9]{1,}@([a-zA-z0-9]{1,}\\.)[a-zA-z]{1,}$";

    private static final String PHONE_PATTERN = "^[0-9]{11}$";

    public static boolean emailVerify(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phoneVerify(String phone) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }


}
