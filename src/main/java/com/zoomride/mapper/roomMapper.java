package com.zoomride.mapper;

import com.zoomride.entity.room;

public interface roomMapper {
    int deleteByPrimaryKey(String id);

    int insert(room record);

    int insertSelective(room record);

    room selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(room record);

    int updateByPrimaryKey(room record);
}