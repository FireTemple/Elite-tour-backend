package com.zoomride.entity;

import java.io.Serializable;

public class Tour implements Serializable {
    private String id;

    private String name;

    private String description;

    private String details;

    private String duration;

    private String maxDuration;

    private String country;

    private String countryArea;

    private String detailsLink;

    private String status;

    private String cPrice;

    private String pPrice;

    private String type;

    private String hasAccessibility;

    private String isAllowedPet;

    private String hasAudioGuide;

    private String hasTourGuide;

    private String includeDescription;

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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getMaxDuration() {
        return maxDuration;
    }

    public void setMaxDuration(String maxDuration) {
        this.maxDuration = maxDuration == null ? null : maxDuration.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(String countryArea) {
        this.countryArea = countryArea == null ? null : countryArea.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getHasAccessibility() {
        return hasAccessibility;
    }

    public void setHasAccessibility(String hasAccessibility) {
        this.hasAccessibility = hasAccessibility == null ? null : hasAccessibility.trim();
    }

    public String getIsAllowedPet() {
        return isAllowedPet;
    }

    public void setIsAllowedPet(String isAllowedPet) {
        this.isAllowedPet = isAllowedPet == null ? null : isAllowedPet.trim();
    }

    public String getHasAudioGuide() {
        return hasAudioGuide;
    }

    public void setHasAudioGuide(String hasAudioGuide) {
        this.hasAudioGuide = hasAudioGuide == null ? null : hasAudioGuide.trim();
    }

    public String getHasTourGuide() {
        return hasTourGuide;
    }

    public void setHasTourGuide(String hasTourGuide) {
        this.hasTourGuide = hasTourGuide == null ? null : hasTourGuide.trim();
    }

    public String getIncludeDescription() {
        return includeDescription;
    }

    public void setIncludeDescription(String includeDescription) {
        this.includeDescription = includeDescription == null ? null : includeDescription.trim();
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
        sb.append(", duration=").append(duration);
        sb.append(", maxDuration=").append(maxDuration);
        sb.append(", country=").append(country);
        sb.append(", countryArea=").append(countryArea);
        sb.append(", detailsLink=").append(detailsLink);
        sb.append(", status=").append(status);
        sb.append(", cPrice=").append(cPrice);
        sb.append(", pPrice=").append(pPrice);
        sb.append(", type=").append(type);
        sb.append(", hasAccessibility=").append(hasAccessibility);
        sb.append(", isAllowedPet=").append(isAllowedPet);
        sb.append(", hasAudioGuide=").append(hasAudioGuide);
        sb.append(", hasTourGuide=").append(hasTourGuide);
        sb.append(", includeDescription=").append(includeDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}