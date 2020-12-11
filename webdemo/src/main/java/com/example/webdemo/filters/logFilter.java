package com.example.webdemo.filters;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lxl
 * @date 2020/12/11 10:52
 */
@Slf4j
public class logFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("进入过滤器了");
    }

    @Override
    public void destroy() {

    }
}
