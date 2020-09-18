package com.zoomride.service.impl;

import com.zoomride.entity.Booking;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.BookingMapper;
import com.zoomride.service.BookingService;
import com.zoomride.vo.req.BookingAddReqVO;
import com.zoomride.vo.req.BookingUpdateReqVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingMapper bookingMapper;

    @Override
    public void canceledOrder(String id, String status) {
        int i = bookingMapper.changeStatus(id, status);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }

    @Override
    public void confirmOrder(String id, String status) {
        int i = bookingMapper.changeStatus(id, status);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }

    }

    @Override
    public void addBookingOrder(BookingAddReqVO bookingAddReqVO) {

        Booking booking = new Booking();
        BeanUtils.copyProperties(bookingAddReqVO, booking);

        booking.setCreateTime(new Date().toString());
        booking.setId(UUID.randomUUID().toString());

        int i = bookingMapper.insertSelective(booking);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void deleteBookingOrder(String id) {
        int i = bookingMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }

    @Override
    public void updateOrder(BookingUpdateReqVO bookingUpdateReqVO) {
        Booking booking = new Booking();
        BeanUtils.copyProperties(bookingUpdateReqVO, booking);

        int i = bookingMapper.updateByPrimaryKeySelective(booking);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }

    @Override
    public List<Booking> queryAll() {
        return bookingMapper.queryAll();
    }
}
