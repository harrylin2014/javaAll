package com.example.bootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxl
 * @date 2020/8/12 17:50
 */
@RestController
@RequestMapping("/testRedis")
public class TestRedisController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/testSet")
    public String setRedis(){

        redisTemplate.opsForSet().add("test001","test001");
        UserVo userVo = new UserVo();
        userVo.setUserId("12");
        userVo.setUserName("test");
        redisUtils.set("testObject",userVo);

        UserVo uo = (UserVo) redisUtils.get("testObject");
        System.out.println(uo.getUserId()+":"+uo.getUserName());

        return "success";
    }
    @GetMapping("/testAssert")
    public String testAssert(String param){
        Assert.hasText(param,"param不能为空");

        return "success";
    }

}
