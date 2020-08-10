package com.zoomride.mapper;

import com.zoomride.entity.Tour;

import java.util.List;

public interface TourMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tour record);

    int insertSelective(Tour record);

    Tour selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tour record);

    int updateByPrimaryKey(Tour record);

    List<Tour> selectAll();

    int deleteTour(String id);
}