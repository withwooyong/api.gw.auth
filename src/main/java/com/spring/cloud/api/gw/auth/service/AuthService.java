package com.spring.cloud.api.gw.auth.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthService {

    public String getHello() {
        return "auth hello";
    }

    public String getToken(String userName) {
        String s = RandomStringUtils.randomAlphabetic(10);
        log.info("random={}", s);
        return userName + "_" + s;
    }
}
