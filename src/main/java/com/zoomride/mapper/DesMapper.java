package com.zoomride.mapper;

import com.zoomride.entity.Des;

public interface DesMapper {
    int deleteByPrimaryKey(String id);

    int insert(Des record);

    int insertSelective(Des record);

    Des selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Des record);

    int updateByPrimaryKey(Des record);
}