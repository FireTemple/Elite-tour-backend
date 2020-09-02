package com.zoomride.mapper;

import com.zoomride.entity.Room;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(String id);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);

    List<Room> queryByHotelId(String id);
}