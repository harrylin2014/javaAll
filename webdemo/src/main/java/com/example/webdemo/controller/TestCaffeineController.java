package com.example.webdemo.controller;

import com.example.webdemo.entity.UserInfo;
import com.example.webdemo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxl
 * @date 2020/9/8 14:40
 */
@RestController
@RequestMapping("caffeine")
@Slf4j
public class TestCaffeineController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("create")
    public String createCache(){
        userInfoService.createUser();


        return "success";
    }

    @RequestMapping("get")
    public String getCache(){

        UserInfo userInfo = userInfoService.getUser();
        log.info("userinfo:"+userInfo.getUserName());

        return "success";
    }

}
