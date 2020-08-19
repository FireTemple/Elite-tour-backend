package com.zoomride.service;

import com.zoomride.entity.Tour;
import com.zoomride.vo.req.TourAddReqVO;
import com.zoomride.vo.req.TourUpdateReqVO;

import java.util.List;

public interface TourService {

    List<Tour> queryAll();
    List<Tour> queryAllActive();

    void addTour(TourAddReqVO tourAddReqVO);
    void updateTour(TourUpdateReqVO tourUpdateReqVO);
    void deleteTour(String tourId);
    Tour queryTour(String id);

    void waveTour(String id);

}
