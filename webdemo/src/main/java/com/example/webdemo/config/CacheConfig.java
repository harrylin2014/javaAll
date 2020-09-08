package com.example.webdemo.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author lxl
 * @date 2020/9/8 14:20
 */
@Configuration
public class CacheConfig {

    @Bean
    public Cache<String,Object> caffeineCache(){
        return Caffeine.newBuilder()
                //最后一次写入或者访问后经过固定时间过期
                .expireAfterWrite(60, TimeUnit.SECONDS)
                //初始化缓存空间大小
                .initialCapacity(100)
                //最大缓存条数
                .maximumSize(1000)
                .build();


    }

}
