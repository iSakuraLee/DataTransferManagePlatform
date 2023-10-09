package com.onlee.dtmp.streaming.controller;

import com.onlee.dtmp.common.utils.BaseInfoUtil;
import com.onlee.dtmp.common.utils.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class StreamingDataManageController {

    private static final Logger logger = LoggerFactory.getLogger(StreamingDataManageController.class);

    @PostConstruct
    public void init() {
        logger.info("======================程序正在初始化=====================");

        DateUtil dateUtil = DateUtil.getInstance();
        String currentDate = dateUtil.getCurrentDate();
        BaseInfoUtil baseInfoUtil = BaseInfoUtil.getInstance();
        String hostIp = baseInfoUtil.getHostIp();

        logger.info("当前服务器信息：" + "节点信息==>" + hostIp + "; 系统时间==>" + currentDate);
    }

}
