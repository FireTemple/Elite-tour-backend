package com.zoomride.service;

import com.zoomride.entity.Booking;
import com.zoomride.vo.req.BookingAddReqVO;
import com.zoomride.vo.req.BookingUpdateReqVO;

import java.util.List;

public interface BookingService {

    void canceledOrder(String id, String status);

    void confirmOrder(String id, String status);

    void addBookingOrder(BookingAddReqVO bookingAddReqVO);

    void deleteBookingOrder(String id);

    void updateOrder(BookingUpdateReqVO bookingUpdateReqVO);

    List<Booking> queryAll();
}
