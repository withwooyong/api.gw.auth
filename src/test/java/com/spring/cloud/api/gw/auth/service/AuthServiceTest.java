package com.spring.cloud.api.gw.auth.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthServiceTest {

    @Autowired
    AuthService authService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getHello() {
        String hello = authService.getHello();
        System.out.println(hello);
    }

    @Test
    void getToken() {
        String userName = authService.getToken("userName");
        System.out.println(userName);
    }
}