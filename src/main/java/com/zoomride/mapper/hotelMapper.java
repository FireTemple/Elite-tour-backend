package com.zoomride.mapper;

import com.zoomride.entity.hotel;

public interface hotelMapper {
    int deleteByPrimaryKey(String id);

    int insert(hotel record);

    int insertSelective(hotel record);

    hotel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(hotel record);

    int updateByPrimaryKey(hotel record);
}