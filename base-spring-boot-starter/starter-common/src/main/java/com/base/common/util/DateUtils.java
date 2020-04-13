package com.base.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yyc
 * @apiNote 通用时间类
 */
public class DateUtils {

    private static final String DATE_HH = "yyyy-MM-dd HH:mm:ss";

    private static final String DATE_hh = "yyyy-MM-dd hh:mm:ss";

    private static final String DATE_CONNECT = "yyyyMMddHHmmss";

    /**
     * yyyy-MM-dd HH:mm:ss
     * */
    public static String dateForMateForHH(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_HH);
        String time = simpleDateFormat.format(date);
        return time;
    }

    /**
     * yyyy-MM-dd hh:mm:ss
     * */
    public static String dateForMateForhh(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_hh);
        String time = simpleDateFormat.format(date);
        return time;
    }

    public static String dateForMateForConnect(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_CONNECT);
        String time = simpleDateFormat.format(date);
        return time;
    }

}
