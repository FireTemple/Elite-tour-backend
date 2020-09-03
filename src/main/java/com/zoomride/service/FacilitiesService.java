package com.zoomride.service;

import com.zoomride.entity.Facility;

import java.util.List;

public interface FacilitiesService {

    List<Facility> queryByHotelId(String id);
}
