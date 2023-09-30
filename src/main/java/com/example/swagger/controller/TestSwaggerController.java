package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/swagger-ui.html
 */
@RestController
@RequestMapping("/test")
public class TestSwaggerController {
    @GetMapping
    public String test(@RequestParam(required = false) String string){
        return string;
    }
}
