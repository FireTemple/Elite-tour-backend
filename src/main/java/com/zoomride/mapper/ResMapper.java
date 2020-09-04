package com.zoomride.mapper;

import com.zoomride.entity.Res;

import java.util.List;

public interface ResMapper {
    int deleteByPrimaryKey(String id);

    int insert(Res record);

    int insertSelective(Res record);

    Res selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Res record);

    int updateByPrimaryKey(Res record);

    List<Res> queryAll();
    List<Res> queryAllActive();

    int deleteById(String id);
}