package com.expanse.tracker.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/expenses/")
public class ExpenseController {

    @PostMapping("/add")
    public static void addExpense(){

    }

    @GetMapping("/list")
    public static void getListOfExpense(){

    }

    @GetMapping("/filter")
    public static void getFilteredExpanse(){

    }

    @DeleteMapping("/delete/{id}")
    public static void deleteExpanse(){

    }
}
