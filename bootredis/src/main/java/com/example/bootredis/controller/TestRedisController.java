package com.example.bootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
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

}
