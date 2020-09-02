package com.zoomride.mapper;

import com.zoomride.entity.Hotel;

import java.util.List;

public interface HotelMapper {
    int deleteByPrimaryKey(String id);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);

    List<Hotel> queryAll();

    List<Hotel> queryAllActive();

    int deleteHotel(String id);


}