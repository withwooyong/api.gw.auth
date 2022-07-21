package com.spring.cloud.api.gw.auth.controller;

import com.spring.cloud.api.gw.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping
    ResponseEntity<String> getHello() {
        String hello = authService.getHello();
        return ResponseEntity.ok(hello);
    }

    /**
     * http://localhost:8082/auth/token?userName=token
     */
    @GetMapping(path = "/token")
    ResponseEntity<String> getToken(@RequestParam String userName) {
        String token = authService.getToken(userName);
        return ResponseEntity.ok(token);
    }
}
