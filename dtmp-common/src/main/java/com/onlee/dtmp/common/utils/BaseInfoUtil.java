package com.onlee.dtmp.common.utils;


import java.net.InetAddress;
import java.net.UnknownHostException;

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
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            String hostName = localHost.getHostName();
            String address = localHost.getHostAddress();

            return hostName + ":" + address;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return "获取失败";
    }
}
