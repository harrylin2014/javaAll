package com.example.bootredis.controller;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lxl
 * @date 2020/8/13 9:29
 */
@Data
public class UserVo implements Serializable {
    private String userName;
    private String userId;
}
