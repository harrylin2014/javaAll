package com.example.webdemo.service;

import com.example.webdemo.entity.UserInfo;
import org.springframework.stereotype.Service;

/**
 * @author lxl
 * @date 2020/9/8 14:42
 */
public interface UserInfoService {

    public void createUser();

    public UserInfo getUser();

}
