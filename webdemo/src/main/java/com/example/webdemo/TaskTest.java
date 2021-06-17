package com.example.webdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author lxl
 * @date 2021/5/13 10:07
 */
@Component
@Slf4j
public class TaskTest {

    @Scheduled(cron = "0 0/3 * * * ? ")
    public void scanHccJob() throws Exception{
        System.out.println("测试1");
        log.info("test定时");
    }

    @Scheduled(cron = "0 0/3 * * * ?")
    public void scanHccJob2() throws Exception{
        System.out.println("test2");
        log.info("test定时2");
    }

}
