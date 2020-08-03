package com.zoomride.mapper;

import com.zoomride.entity.Item;

import java.util.List;

public interface ItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);

    List<Item> queryAll();
}