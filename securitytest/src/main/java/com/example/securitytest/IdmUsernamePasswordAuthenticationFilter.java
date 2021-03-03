package com.example.securitytest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 继承AbstractAuthenticationProcessingFilter 可以自定义认证方式
 * @author lxl
 * @date 2021/2/22 14:04
 */
@Slf4j
@Component
public class IdmUsernamePasswordAuthenticationFilter extends AbstractAuthenticationProcessingFilter {


    public IdmUsernamePasswordAuthenticationFilter(IdmLoginAuthenticationManager idmLoginAuthenticationManager) {
        //拦截url为 "/login" 的POST请求
        super(new AntPathRequestMatcher("/logind", "POST"));
        this.setAuthenticationManager(idmLoginAuthenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //从json中获取username和password
        String body = StreamUtils.copyToString(request.getInputStream(), StandardCharsets.UTF_8);
        String username = null;
        String password = null;

        log.info("body信息："+body);
        if(StringUtils.hasText(body)) {
            
        }
        if (username == null){
            username = "";
        }
        if (password == null){
            password = "";
        }

        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
                username, password);
        return this.getAuthenticationManager().authenticate(authRequest);
    }
}
