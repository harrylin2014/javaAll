package com.example.webdemo.service.impl;

import com.example.webdemo.entity.UserInfo;
import com.example.webdemo.service.UserInfoService;
import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lxl
 * @date 2020/9/8 14:43
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private Cache<String,Object> caffeineCache;

    @Override
    public void createUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1);
        userInfo.setUserName("linxuelei");
        userInfo.setPassword("linxuelei");

        caffeineCache.put("user1",userInfo);
    }

    @Override
    public UserInfo getUser() {
        return (UserInfo) caffeineCache.asMap().get("user1");
    }
}
