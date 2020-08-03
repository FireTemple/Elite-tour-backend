package com.zoomride.mapper;

import com.zoomride.entity.DesIncludeItem;

public interface DesIncludeItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(DesIncludeItem record);

    int insertSelective(DesIncludeItem record);

    DesIncludeItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DesIncludeItem record);

    int updateByPrimaryKey(DesIncludeItem record);
}