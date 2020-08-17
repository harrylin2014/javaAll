package com.example.bootmybatis.dao;

import com.example.bootmybatis.domain.Test1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Test1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    Test1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
}