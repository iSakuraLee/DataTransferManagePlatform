package com.onlee.dtmp.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ManageApplication {

    public static void main(String[] args) {
        // 密钥
        System.setProperty("jasypt.encryptor.password", "End2Start");
        SpringApplication.run(ManageApplication.class, args);
    }

}
