package com.zoomride.mapper;

import com.zoomride.entity.BrifSchedule;

public interface BrifScheduleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BrifSchedule record);

    int insertSelective(BrifSchedule record);

    BrifSchedule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BrifSchedule record);

    int updateByPrimaryKey(BrifSchedule record);
}