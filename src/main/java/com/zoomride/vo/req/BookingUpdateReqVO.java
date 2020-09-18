package com.zoomride.vo.req;

import lombok.Data;

@Data
public class BookingUpdateReqVO {

    private String id;

    private String bookingDate;

    private String bookingTime;

    private String name;

    private String itemId;

    private String price;

    private String type;

    private String email;

    private String phone;

    private String createTime;

    private String status;
}
