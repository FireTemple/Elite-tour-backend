package com.zoomride.mapper;

import com.zoomride.entity.Review;

public interface ReviewMapper {
    int deleteByPrimaryKey(String id);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
}