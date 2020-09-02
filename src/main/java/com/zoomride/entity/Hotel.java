package com.zoomride.entity;

import java.io.Serializable;

public class Hotel implements Serializable {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
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

    public String getDetailsLink() {
        return detailsLink;
    }

    public void setDetailsLink(String detailsLink) {
        this.detailsLink = detailsLink == null ? null : detailsLink.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(String hasWifi) {
        this.hasWifi = hasWifi == null ? null : hasWifi.trim();
    }

    public String getHasTv() {
        return hasTv;
    }

    public void setHasTv(String hasTv) {
        this.hasTv = hasTv == null ? null : hasTv.trim();
    }

    public String getHasPool() {
        return hasPool;
    }

    public void setHasPool(String hasPool) {
        this.hasPool = hasPool == null ? null : hasPool.trim();
    }

    public String getHasFitness() {
        return hasFitness;
    }

    public void setHasFitness(String hasFitness) {
        this.hasFitness = hasFitness == null ? null : hasFitness.trim();
    }

    public String getHasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(String hasRestaurant) {
        this.hasRestaurant = hasRestaurant == null ? null : hasRestaurant.trim();
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

    public String getHasParking() {
        return hasParking;
    }

    public void setHasParking(String hasParking) {
        this.hasParking = hasParking == null ? null : hasParking.trim();
    }

    public String getHasBreakfast() {
        return hasBreakfast;
    }

    public void setHasBreakfast(String hasBreakfast) {
        this.hasBreakfast = hasBreakfast == null ? null : hasBreakfast.trim();
    }

    public String getFacilitiesDes() {
        return facilitiesDes;
    }

    public void setFacilitiesDes(String facilitiesDes) {
        this.facilitiesDes = facilitiesDes == null ? null : facilitiesDes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", details=").append(details);
        sb.append(", address=").append(address);
        sb.append(", cPrice=").append(cPrice);
        sb.append(", pPrice=").append(pPrice);
        sb.append(", detailsLink=").append(detailsLink);
        sb.append(", status=").append(status);
        sb.append(", type=").append(type);
        sb.append(", hasWifi=").append(hasWifi);
        sb.append(", hasTv=").append(hasTv);
        sb.append(", hasPool=").append(hasPool);
        sb.append(", hasFitness=").append(hasFitness);
        sb.append(", hasRestaurant=").append(hasRestaurant);
        sb.append(", allowPet=").append(allowPet);
        sb.append(", hasAccessibility=").append(hasAccessibility);
        sb.append(", hasParking=").append(hasParking);
        sb.append(", hasBreakfast=").append(hasBreakfast);
        sb.append(", facilitiesDes=").append(facilitiesDes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}