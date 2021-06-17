package com.example.webdemo.controller;

import com.example.webdemo.model.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author lxl
 * @date 2020/12/14 13:27
 */
@Controller
@RequestMapping("/testwx")
public class TestBackWx {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(HttpServletRequest request, @RequestParam Map<String,String> parameters)
    {

        System.out.println(request.getServletPath());
        System.out.println(request.getPathInfo());

        parameters.forEach(
                (key,value) -> {System.out.println("key:"+key+",value:"+value);}
        );

        System.out.println(request.getServletPath());
        return "success";
    }



}
