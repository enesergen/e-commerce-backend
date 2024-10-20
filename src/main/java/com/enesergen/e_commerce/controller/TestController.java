package com.enesergen.e_commerce.controller;

import com.enesergen.e_commerce.exception.ECommerceException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        throw new ECommerceException(123,"Test Deneme");
    }

}
