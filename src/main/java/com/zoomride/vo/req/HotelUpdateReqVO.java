package com.zoomride.vo.req;

import lombok.Data;

import java.util.List;


@Data
public class HotelUpdateReqVO {
    private String id;

    private String name;

    private String description;

    private String details;

    private String address;

    private String cPrice;

    private String pPrice;

    private String detailsLink;

    private String status;

    private String type;

    private String hasWifi;

    private String hasTv;

    private String hasPool;

    private String hasFitness;

    private String hasRestaurant;

    private String allowPet;

    private String hasAccessibility;

    private String hasParking;

    private String hasBreakfast;

    private String facilitiesDes;

    private List<RoomUpdateReqVO> rooms;

    private List<FacilityUpdateReqVO> facilities;
}
