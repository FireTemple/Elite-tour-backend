package com.zoomride.service;

import com.zoomride.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> queryByHotelId(String id);
    void deleteById(String id);
    void updateByRecord(Room room);
}
