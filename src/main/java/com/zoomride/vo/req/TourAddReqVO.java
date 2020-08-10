package com.zoomride.vo.req;

import lombok.Data;

import java.util.List;

@Data
public class TourAddReqVO {

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

    private List<IncludeItemAddReqVO> includeItems;
}
