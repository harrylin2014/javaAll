package com.wglvzyx.mybatisredis.dao;

import com.wglvzyx.mybatisredis.entity.DayReportVideo;

public interface DayReportVideoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DayReportVideo record);

    int insertSelective(DayReportVideo record);

    DayReportVideo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DayReportVideo record);

    int updateByPrimaryKey(DayReportVideo record);
}