package com.example.securitytest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class IdmLoginAuthenticationProvider implements AuthenticationProvider {


    @Override
    public Authentication authenticate(Authentication authentication){
        log.info("authentication2:{}",authentication);

        UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(null, null, null);
        result.setDetails(authentication.getDetails());
        log.info("result:{}",result);
        return result;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        //这个方法返回true，说明支持该类型的token
        return aClass.isAssignableFrom(UsernamePasswordAuthenticationToken.class);
    }
}
