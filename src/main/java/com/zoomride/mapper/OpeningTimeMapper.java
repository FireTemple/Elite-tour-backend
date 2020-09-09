package com.zoomride.mapper;

import com.zoomride.entity.OpeningTime;

import java.util.List;

public interface OpeningTimeMapper {
    int deleteByPrimaryKey(String id);

    int insert(OpeningTime record);

    int insertSelective(OpeningTime record);

    OpeningTime selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OpeningTime record);

    int updateByPrimaryKey(OpeningTime record);

    List<OpeningTime> queryByResId(String id);

}