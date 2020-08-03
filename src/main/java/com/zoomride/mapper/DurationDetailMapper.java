package com.zoomride.mapper;

import com.zoomride.entity.DurationDetail;

public interface DurationDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(DurationDetail record);

    int insertSelective(DurationDetail record);

    DurationDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DurationDetail record);

    int updateByPrimaryKey(DurationDetail record);
}