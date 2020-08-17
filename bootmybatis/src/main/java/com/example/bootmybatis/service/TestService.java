package com.example.bootmybatis.service;

import com.example.bootmybatis.dao.Test1Mapper;
import com.example.bootmybatis.domain.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lxl
 * @date 2020/8/17 16:42
 */
@Service
public class TestService {

    @Autowired(required = false)
    private Test1Mapper test1Mapper;

    public int insertTest(Test1 test1){
        return test1Mapper.insert(test1);
    }

}
