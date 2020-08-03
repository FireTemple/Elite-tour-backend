package com.zoomride.mapper;

import com.zoomride.entity.BigInfo;

public interface BigInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(BigInfo record);

    int insertSelective(BigInfo record);

    BigInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BigInfo record);

    int updateByPrimaryKey(BigInfo record);
}