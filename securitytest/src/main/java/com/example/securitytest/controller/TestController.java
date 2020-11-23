package com.example.securitytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxl
 * @date 2020/11/12 16:51
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @GetMapping
    public String getUsers(){

        return "hello security";
    }

}
