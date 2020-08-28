package com.zoomride.mapper;

import com.zoomride.entity.facility;

public interface facilityMapper {
    int deleteByPrimaryKey(String id);

    int insert(facility record);

    int insertSelective(facility record);

    facility selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(facility record);

    int updateByPrimaryKey(facility record);
}