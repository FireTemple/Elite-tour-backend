package com.zoomride.entity;

import java.io.Serializable;

public class Room implements Serializable {
    private String id;

    private String hotelId;

    private String type;

    private String des;

    private String hasWifi;

    private String wifiDes;

    private String hasTV;

    private String tvDes;

    private String hasSafetyBox;

    private String safteyBoxDes;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(String hasWifi) {
        this.hasWifi = hasWifi == null ? null : hasWifi.trim();
    }

    public String getWifiDes() {
        return wifiDes;
    }

    public void setWifiDes(String wifiDes) {
        this.wifiDes = wifiDes == null ? null : wifiDes.trim();
    }

    public String getHasTV() {
        return hasTV;
    }

    public void setHasTV(String hasTV) {
        this.hasTV = hasTV;
    }

    public String getTvDes() {
        return tvDes;
    }

    public void setTvDes(String tvDes) {
        this.tvDes = tvDes == null ? null : tvDes.trim();
    }

    public String getHasSafetyBox() {
        return hasSafetyBox;
    }

    public void setHasSafetyBox(String hasSafetyBox) {
        this.hasSafetyBox = hasSafetyBox == null ? null : hasSafetyBox.trim();
    }

    public String getSafteyBoxDes() {
        return safteyBoxDes;
    }

    public void setSafteyBoxDes(String safteyBoxDes) {
        this.safteyBoxDes = safteyBoxDes == null ? null : safteyBoxDes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hotelId=").append(hotelId);
        sb.append(", type=").append(type);
        sb.append(", des=").append(des);
        sb.append(", hasWifi=").append(hasWifi);
        sb.append(", wifiDes=").append(wifiDes);
        sb.append(", hasTV=").append(hasTV);
        sb.append(", tvDes=").append(tvDes);
        sb.append(", hasSafetyBox=").append(hasSafetyBox);
        sb.append(", safteyBoxDes=").append(safteyBoxDes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}