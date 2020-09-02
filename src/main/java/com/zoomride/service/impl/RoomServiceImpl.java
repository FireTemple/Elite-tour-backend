package com.zoomride.service.impl;

import com.zoomride.entity.Room;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.RoomMapper;
import com.zoomride.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomMapper roomMapper;


    @Override
    public List<Room> queryByHotelId(String id) {
        return roomMapper.queryByHotelId(id);
    }

    @Override
    public void deleteById(String id) {

        int i = roomMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }

    }

    @Override
    public void updateByRecord(Room room) {
        int i = roomMapper.updateByPrimaryKey(room);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }
}
