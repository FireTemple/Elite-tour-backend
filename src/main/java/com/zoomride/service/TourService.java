package com.zoomride.service;

import com.zoomride.entity.Tour;
import com.zoomride.vo.req.TourAddReqVO;

import java.util.List;

public interface TourService {

    List<Tour> queryAll();
    void addTour(TourAddReqVO tourAddReqVO);
    void updateTour(Tour tour);
    void deleteTour(String tourId);
    Tour queryTour(String id);
}
