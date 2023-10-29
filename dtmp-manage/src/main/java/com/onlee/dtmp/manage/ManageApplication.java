package com.onlee.dtmp.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.onlee.dtmp.manage.dao")
public class ManageApplication {

    public static void main(String[] args) {
        // 密钥
        System.setProperty("jasypt.encryptor.password", "End2Start");
        SpringApplication.run(ManageApplication.class, args);
    }

}
