package com.zoomride.service.impl;

import com.zoomride.entity.IncludeItem;
import com.zoomride.entity.Tour;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.IncludeItemMapper;
import com.zoomride.mapper.TourMapper;
import com.zoomride.service.TourService;
import com.zoomride.vo.req.IncludeItemAddReqVO;
import com.zoomride.vo.req.IncludeItemUpdateReqVO;
import com.zoomride.vo.req.TourAddReqVO;
import com.zoomride.vo.req.TourUpdateReqVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<Tour> queryAllActive() {
        return tourMapper.selectAllActive();
    }

    @Override
    @Transactional
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
    @Transactional
    public void updateTour(TourUpdateReqVO tourUpdateReqVO) {
        Tour tour = new Tour();
        BeanUtils.copyProperties(tourUpdateReqVO, tour);

        for (IncludeItemUpdateReqVO includeItemUpdateReqVO : tourUpdateReqVO.getIncludeItems()){
                IncludeItem includeItem = new IncludeItem();
            if (includeItemUpdateReqVO.getId() == "" || includeItemUpdateReqVO.getId() == null){
                includeItem.setId(UUID.randomUUID().toString());
                includeItem.setItemId(tour.getId());
                includeItem.setContent(includeItemUpdateReqVO.getContent());
                int i = includeItemMapper.insertSelective(includeItem);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT_MID_TIER);
                }
            }else{
                BeanUtils.copyProperties(includeItemUpdateReqVO, includeItem);
                int i = includeItemMapper.updateByPrimaryKeySelective(includeItem);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
                }
            }
        }

        int i = tourMapper.updateByPrimaryKeySelective(tour);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
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

    @Override
    public void waveTour(String id) {

        int i = tourMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }

    }
}
