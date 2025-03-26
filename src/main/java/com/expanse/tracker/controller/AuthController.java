package com.expanse.tracker.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/auth")
public class AuthController {
    @PostMapping("/register")
    public static void registerNewUser(){

    }

    @PostMapping("/login")
    public static void loginUser(){

    }

    @PostMapping("/logout")
    public static void logOut(){

    }
}
