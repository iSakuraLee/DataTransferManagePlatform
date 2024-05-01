package com.onlee.dtmp.common.utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateUtil {

    private static DateUtil instance;

    private static final String[] DATE_FORMAT = new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd", "dd/MM/yyyy", "HH:mm:ss", "yyyyMMdd"};

    private DateUtil(){}

    public static DateUtil getInstance() {
        if (instance == null) {
            instance = new DateUtil();
        }
        return instance;
    }

    /**
     * 获取当前日期和时间
     * @return 日期和时间的字符串,格式:yyyy-MM-dd HH:mm:ss
     */
    public String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    /**
     * 获取指定格式的时间日期
     * @param format 时间日期格式
     * @return 指定格式的日期时间
     */
    public String getCurrentDateByFormat(String format) {
        if (format == null || format.isEmpty()) {
            return getCurrentDate();
        } else {
            if (!Arrays.asList(DATE_FORMAT).contains(format)) {
                System.out.println("================不支持的日期时间格式，请重新指定=================");
                throw new RuntimeException("日期时间格式不满足要求");
            } else {
                return new SimpleDateFormat(format).format(new Date());
            }
        }
    }

    public long trans2TimeStamp(Date date) {
        return date.getTime();
    }

}
