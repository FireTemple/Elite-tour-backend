package com.zoomride.vo.req;

import lombok.Data;

@Data
public class RoomUpdateReqVO {

    private String id;

    private String type;

    private String des;

    private String hasWifi;

    private String wifiDes;

    private String hasTv;

    private String tvDes;

    private String hasSafetyBox;

    private String safteyBoxDes;

}
