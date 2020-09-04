package com.zoomride.mapper;

import com.zoomride.entity.OpeningTime;

public interface OpeningTimeMapper {
    int deleteByPrimaryKey(String id);

    int insert(OpeningTime record);

    int insertSelective(OpeningTime record);

    OpeningTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OpeningTime record);

    int updateByPrimaryKey(OpeningTime record);
}