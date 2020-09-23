package com.zoomride.mapper;

import com.zoomride.entity.Booking;

import java.util.List;

public interface BookingMapper {
    int deleteByPrimaryKey(String id);

    int insert(Booking record);

    int insertSelective(Booking record);

    Booking selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Booking record);

    int updateByPrimaryKey(Booking record);

    int changeStatus(String id,String status);

    List<Booking> queryAll();


}