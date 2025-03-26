package com.expanse.tracker.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/categories/")
public class CategoryController {

    @GetMapping("/list")
    public static void getListOfCategories(){

    }

    @PostMapping("/add")
    public static void addNewCatrgory(){

    }

    @DeleteMapping("/delete/{id}")
    public static void deleteCategory(){

    }
}
