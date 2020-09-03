package com.zoomride.service.impl;

import com.zoomride.entity.Facility;
import com.zoomride.entity.Hotel;
import com.zoomride.entity.Room;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.FacilityMapper;
import com.zoomride.mapper.HotelMapper;
import com.zoomride.mapper.RoomMapper;
import com.zoomride.service.HotelService;
import com.zoomride.vo.req.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelMapper hotelMapper;

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    FacilityMapper facilityMapper;

    @Override
    public List<Hotel> queryAll() {
        return hotelMapper.queryAll();
    }

    @Override
    public List<Hotel> queryAllActive() {
        return hotelMapper.queryAllActive();
    }

    @Override
    @Transactional
    public void addHotel(HotelAddReqVO hotelAddReqVO) {

        System.out.println(hotelAddReqVO.toString());

        Hotel hotel = new Hotel();

        BeanUtils.copyProperties(hotelAddReqVO, hotel);
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);

        int i1 = hotelMapper.insertSelective(hotel);
        if (i1 != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

        for (RoomAddReqVO roomAddReqVO: hotelAddReqVO.getRooms()){
            Room room = new Room();
            BeanUtils.copyProperties(roomAddReqVO, room);
            room.setId(UUID.randomUUID().toString());
            room.setHotelId(hotelId);

            int i = roomMapper.insertSelective(room);
            if (i != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
            }
        }

        for (FacilityAddReqVO facilityAddReqVO : hotelAddReqVO.getFacilities()){
            Facility facility = new Facility();
            BeanUtils.copyProperties(facilityAddReqVO, facility);
            facility.setId(UUID.randomUUID().toString());
            facility.setHotelId(hotelId);

            int i = facilityMapper.insertSelective(facility);
            if (i != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
            }
        }



    }

    @Override
    @Transactional
    public void updateHotel(HotelUpdateReqVO hotelUpdateReqVO) {
        Hotel hotel = new Hotel();
        BeanUtils.copyProperties(hotelUpdateReqVO, hotel);

        for (RoomUpdateReqVO roomUpdateReqVO: hotelUpdateReqVO.getRooms()){
            Room room = new Room();
            BeanUtils.copyProperties(roomUpdateReqVO, room);
            if (roomUpdateReqVO.getId()== "" || roomUpdateReqVO.getId() == null){
                room.setId(UUID.randomUUID().toString());
                room.setHotelId(hotel.getId());
                int i = roomMapper.insertSelective(room);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
                }
            }else {
                int i = roomMapper.updateByPrimaryKeySelective(room);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
                }
            }
        }

        int i = hotelMapper.insertSelective(hotel);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void deleteHotel(String hotelId) {
        int i = hotelMapper.deleteHotel(hotelId);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }

    @Override
    public Hotel queryHotel(String id) {
        return hotelMapper.selectByPrimaryKey(id);
    }

    @Override
    public void waveHotel(String id) {
        int i = hotelMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }
}
