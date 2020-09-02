package com.zoomride.mapper;

import com.zoomride.entity.Facility;

public interface FacilityMapper {
    int deleteByPrimaryKey(String id);

    int insert(Facility record);

    int insertSelective(Facility record);

    Facility selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Facility record);

    int updateByPrimaryKey(Facility record);
}