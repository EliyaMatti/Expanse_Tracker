package com.expanse.tracker.controller;

import com.expanse.tracker.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/auth")
public class UserController {

    @GetMapping("/profile")
    public static User getProfileDetails(){

        return null;
    }

    @PutMapping("/update")
    public static void updateProfile(){

    }
}
