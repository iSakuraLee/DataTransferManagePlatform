package com.onlee.dtmp.manage;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestApplication {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getPassword() {
        String encrypt = encryptor.encrypt("");
        System.out.println(encrypt);
    }
}
