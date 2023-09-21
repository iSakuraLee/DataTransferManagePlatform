package com.onlee.dtmp.streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StreamingApplication {

    public static void main(String[] args) {
        System.setProperty("jasypt.encryptor.password", "End2Start");
        SpringApplication.run(StreamingApplication.class, args);
    }

}
