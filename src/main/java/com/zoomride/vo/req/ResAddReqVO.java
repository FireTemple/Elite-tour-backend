package com.zoomride.vo.req;

import lombok.Data;

import java.util.List;

@Data
public class ResAddReqVO {

    private String name;

    private String des;

    private String details;

    private String kind;

    private String type;

    private String address;

    public String getcPrice() {
        return cPrice;
    }

    public void setcPrice(String cPrice) {
        this.cPrice = cPrice;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    private String cPrice;

    private String pPrice;

    private String detailLink;

    private String status;

    private String menuDes;

    private String hasDisabled;

    private String noSmoking;

    private String hasParking;

    private String hasTransport;

    private String allowPet;

    private String hasAccessibility;

    private String disabledDes;

    private String noSmokingDes;

    private String parkingDes;

    private String transportDes;

    private List<MenuAddReqVO> menus;

    private List<OpeningTimeAddReqVO> openingTimeList;
}
