package com.zoomride.mapper;

import com.zoomride.entity.IncludeItem;

import java.util.List;

public interface IncludeItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(IncludeItem record);

    int insertSelective(IncludeItem record);

    IncludeItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IncludeItem record);

    int updateByPrimaryKey(IncludeItem record);

    List<IncludeItem> selectByTourId(String id);
}