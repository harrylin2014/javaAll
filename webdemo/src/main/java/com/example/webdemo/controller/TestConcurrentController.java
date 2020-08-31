package com.example.webdemo.controller;


import com.example.webdemo.annotion.LimitKey;
import com.example.webdemo.model.ResultData;
import com.example.webdemo.properties.PsiProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
@Slf4j
public class TestConcurrentController {

    @Autowired
    private PsiProperties psiProperties;

    @PostMapping("/1")
    @ResponseBody
    @LimitKey()
    public ResultData testPost(){

        ResultData resultData = new ResultData();
        resultData.setCode("1");
        resultData.setMsg("成功");
        return resultData;
    }

    @GetMapping("/properties")
    public ResultData testProperites(){
        ResultData resultData = new ResultData();

        log.info("psiProperits:url:{}",psiProperties.getUrl());

        return resultData;
    }

    @GetMapping("/testPath/{param}")
    public ResultData testPathV(@PathVariable("param") String param){
        System.out.println(param);
        ResultData resultData = new ResultData();
        return resultData;
    }


}
