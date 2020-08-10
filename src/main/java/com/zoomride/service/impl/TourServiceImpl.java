package com.zoomride.service.impl;

import com.zoomride.entity.IncludeItem;
import com.zoomride.entity.Tour;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.IncludeItemMapper;
import com.zoomride.mapper.TourMapper;
import com.zoomride.service.TourService;
import com.zoomride.vo.req.IncludeItemAddReqVO;
import com.zoomride.vo.req.TourAddReqVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    TourMapper tourMapper;

    @Autowired
    IncludeItemMapper includeItemMapper;

    @Override
    public List<Tour> queryAll() {
        return tourMapper.selectAll();
    }

    @Override
    public void addTour(TourAddReqVO tourAddReqVO) {
        Tour tour = new Tour();

        BeanUtils.copyProperties(tourAddReqVO, tour);
        String itemId = UUID.randomUUID().toString();
        tour.setId(itemId);

        for (IncludeItemAddReqVO includeItemAddReqVO : tourAddReqVO.getIncludeItems()){
            IncludeItem includeItem = new IncludeItem();
            includeItem.setId(UUID.randomUUID().toString());
            includeItem.setItemId(itemId);
            includeItem.setContent(includeItemAddReqVO.getContent());
            int i = includeItemMapper.insertSelective(includeItem);
            if (i != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT_MID_TIER);
            }
        }

        int i = tourMapper.insertSelective(tour);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

    }

    @Override
    public void updateTour(Tour tour) {

        int i = tourMapper.updateByPrimaryKeySelective(tour);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }

    @Override
    public void deleteTour(String tourId) {
        int i = tourMapper.deleteTour(tourId);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }

    @Override
    public Tour queryTour(String id) {
        return tourMapper.selectByPrimaryKey(id);
    }
}
