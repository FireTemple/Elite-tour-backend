package com.zoomride.mapper;

import com.zoomride.entity.Kind;

public interface KindMapper {
    int deleteByPrimaryKey(String id);

    int insert(Kind record);

    int insertSelective(Kind record);

    Kind selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Kind record);

    int updateByPrimaryKey(Kind record);
}