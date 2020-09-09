package com.zoomride.service.impl;

import com.zoomride.entity.OpeningTime;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.OpeningTimeMapper;
import com.zoomride.service.OpeningTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpeningTimeServiceImpl implements OpeningTimeService {

    @Autowired
    OpeningTimeMapper openingTimeMapper;

    @Override
    public List<OpeningTime> queryByResId(String id) {
        return openingTimeMapper.queryByResId(id);
    }

    @Override
    public void deleteById(String id) {
        int i = openingTimeMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }
}
