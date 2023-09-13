package com.onlee.dtmp.common.utils;

public class BaseInfoUtil {

    private static BaseInfoUtil instance;

    private BaseInfoUtil() {}

    public static BaseInfoUtil getInstance() {
        if (instance == null) {
            instance = new BaseInfoUtil();
        }

        return instance;
    }

    public String getHostIp() {
        return null;
    }
}
