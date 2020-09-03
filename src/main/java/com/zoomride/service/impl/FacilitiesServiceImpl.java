package com.zoomride.service.impl;

import com.zoomride.entity.Facility;
import com.zoomride.mapper.FacilityMapper;
import com.zoomride.service.FacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilitiesServiceImpl implements FacilitiesService {

    @Autowired
    FacilityMapper facilityMapper;

    @Override
    public List<Facility> queryByHotelId(String id) {
        return facilityMapper.queryByHotelId(id);
    }
}
