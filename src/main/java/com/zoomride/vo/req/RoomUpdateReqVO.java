package com.zoomride.vo.req;

import lombok.Data;

@Data
public class RoomUpdateReqVO {

    private String id;

    private String type;

    private String description;

    private String hasWifi;

    private String wifiDes;

    private String hasTV;

    private String tvDes;

    private String hasSafetyBox;

    private String safteyBoxDes;

}
