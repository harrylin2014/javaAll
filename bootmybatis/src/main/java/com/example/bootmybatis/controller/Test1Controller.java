package com.example.bootmybatis.controller;

import com.example.bootmybatis.dao.Test1Mapper;
import com.example.bootmybatis.domain.Test1;
import com.example.bootmybatis.service.TestService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author lxl
 * @date 2020/8/17 16:43
 */
@RestController
@RequestMapping("/test")
public class Test1Controller {

    @Autowired
    private TestService testService;

    @Autowired(required = false)
    private Test1Mapper test1Mapper;

    @RequestMapping("/testSave")
    public String testSave(){

        Test1 test1 = new Test1();
        test1.setName("2222");
        test1.setCreateDate(new Date());

        return testService.insertTest(test1)+"----";
    }
    @RequestMapping("/testList")
    public String testList(){
        Test1 test1 = test1Mapper.selectByPrimaryKey(1);

        return test1.toString();
    }

}
