package com.zoomride.service;

import com.zoomride.entity.Hotel;
import com.zoomride.vo.req.HotelAddReqVO;
import com.zoomride.vo.req.HotelUpdateReqVO;

import java.util.List;

public interface HotelService {

    List<Hotel> queryAll();
    List<Hotel> queryAllActive();
    void addHotel(HotelAddReqVO hotelAddReqVO);
    void updateHotel(HotelUpdateReqVO hotelUpdateReqVO);
    void deleteHotel(String hotelId);
    Hotel queryHotel(String id);
    void waveHotel(String id);


}
