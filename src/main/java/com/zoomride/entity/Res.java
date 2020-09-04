package com.zoomride.entity;

import java.io.Serializable;

public class Res implements Serializable {
    private String id;

    private String name;

    private String des;

    private String details;

    private String kind;

    private String type;

    private String address;

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

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getcPrice() {
        return cPrice;
    }

    public void setcPrice(String cPrice) {
        this.cPrice = cPrice == null ? null : cPrice.trim();
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice == null ? null : pPrice.trim();
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink == null ? null : detailLink.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMenuDes() {
        return menuDes;
    }

    public void setMenuDes(String menuDes) {
        this.menuDes = menuDes == null ? null : menuDes.trim();
    }

    public String getHasDisabled() {
        return hasDisabled;
    }

    public void setHasDisabled(String hasDisabled) {
        this.hasDisabled = hasDisabled == null ? null : hasDisabled.trim();
    }

    public String getNoSmoking() {
        return noSmoking;
    }

    public void setNoSmoking(String noSmoking) {
        this.noSmoking = noSmoking == null ? null : noSmoking.trim();
    }

    public String getHasParking() {
        return hasParking;
    }

    public void setHasParking(String hasParking) {
        this.hasParking = hasParking == null ? null : hasParking.trim();
    }

    public String getHasTransport() {
        return hasTransport;
    }

    public void setHasTransport(String hasTransport) {
        this.hasTransport = hasTransport == null ? null : hasTransport.trim();
    }

    public String getAllowPet() {
        return allowPet;
    }

    public void setAllowPet(String allowPet) {
        this.allowPet = allowPet == null ? null : allowPet.trim();
    }

    public String getHasAccessibility() {
        return hasAccessibility;
    }

    public void setHasAccessibility(String hasAccessibility) {
        this.hasAccessibility = hasAccessibility == null ? null : hasAccessibility.trim();
    }

    public String getDisabledDes() {
        return disabledDes;
    }

    public void setDisabledDes(String disabledDes) {
        this.disabledDes = disabledDes == null ? null : disabledDes.trim();
    }

    public String getNoSmokingDes() {
        return noSmokingDes;
    }

    public void setNoSmokingDes(String noSmokingDes) {
        this.noSmokingDes = noSmokingDes == null ? null : noSmokingDes.trim();
    }

    public String getParkingDes() {
        return parkingDes;
    }

    public void setParkingDes(String parkingDes) {
        this.parkingDes = parkingDes == null ? null : parkingDes.trim();
    }

    public String getTransportDes() {
        return transportDes;
    }

    public void setTransportDes(String transportDes) {
        this.transportDes = transportDes == null ? null : transportDes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", des=").append(des);
        sb.append(", details=").append(details);
        sb.append(", kind=").append(kind);
        sb.append(", type=").append(type);
        sb.append(", address=").append(address);
        sb.append(", cPrice=").append(cPrice);
        sb.append(", pPrice=").append(pPrice);
        sb.append(", detailLink=").append(detailLink);
        sb.append(", status=").append(status);
        sb.append(", menuDes=").append(menuDes);
        sb.append(", hasDisabled=").append(hasDisabled);
        sb.append(", noSmoking=").append(noSmoking);
        sb.append(", hasParking=").append(hasParking);
        sb.append(", hasTransport=").append(hasTransport);
        sb.append(", allowPet=").append(allowPet);
        sb.append(", hasAccessibility=").append(hasAccessibility);
        sb.append(", disabledDes=").append(disabledDes);
        sb.append(", noSmokingDes=").append(noSmokingDes);
        sb.append(", parkingDes=").append(parkingDes);
        sb.append(", transportDes=").append(transportDes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}