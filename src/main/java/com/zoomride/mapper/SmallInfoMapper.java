package com.zoomride.mapper;

import com.zoomride.entity.SmallInfo;

public interface SmallInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SmallInfo record);

    int insertSelective(SmallInfo record);

    SmallInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SmallInfo record);

    int updateByPrimaryKey(SmallInfo record);
}