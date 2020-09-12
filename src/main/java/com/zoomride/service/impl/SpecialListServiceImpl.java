package com.zoomride.service.impl;

import com.zoomride.entity.SpecialList;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.SpecialListMapper;
import com.zoomride.service.SpecialListService;
import com.zoomride.vo.req.SpecialListAddReqVO;
import com.zoomride.vo.resp.ClassifiedToursQueryRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpecialListServiceImpl implements SpecialListService {

    @Autowired
    SpecialListMapper specialListMapper;

    @Override
    public void addRecord(SpecialListAddReqVO specialListAddReqVO) {
        SpecialList record = new SpecialList();
        record.setId(UUID.randomUUID().toString());
        record.setItemId(specialListAddReqVO.getItemId());
        record.setType(specialListAddReqVO.getStatus());
        int i = specialListMapper.insertSelective(record);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void deleteRecord(String id) {
        int i = specialListMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }

    @Override
    public List<ClassifiedToursQueryRespVO> findSpecialToursByType(String type) {
        return specialListMapper.selectClassifiedTours(type);
    }
}
