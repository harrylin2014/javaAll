package com.example.webdemo.aop;

import com.example.webdemo.annotion.LimitKey;
import com.example.webdemo.model.ResultData;
import com.google.common.util.concurrent.RateLimiter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Order
@Aspect
@Scope
public class LimitAspect {

    //每秒只发出3个令牌,内部采用令牌捅算法实现
    private static RateLimiter rateLimiter = RateLimiter.create(1.0);


    private static final Logger log = LoggerFactory.getLogger(LimitAspect.class);

    @Pointcut("@annotation(limitKey)")
    public void limit(LimitKey limitKey) {
    }

    @Around("limit(limitKey)")
    public Object aroundLog(ProceedingJoinPoint joinpoint, LimitKey limitKey) throws Throwable {
        Object obj = null;
        try {
            //tryAcquire()是非阻塞, rateLimiter.acquire()是阻塞的
            if (rateLimiter.tryAcquire()) {
                obj = joinpoint.proceed();
            } else {
                //拒绝了请求（服务降级）
                ResultData resultData = new ResultData();
                resultData.setCode("2");
                resultData.setMsg("访问量过大,请稍后尝试");
                obj = resultData;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return obj;
    }

}
