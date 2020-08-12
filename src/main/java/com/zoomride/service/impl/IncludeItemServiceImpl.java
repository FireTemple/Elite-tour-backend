package com.zoomride.service.impl;

import com.zoomride.entity.IncludeItem;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.IncludeItemMapper;
import com.zoomride.service.IncludeItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncludeItemServiceImpl implements IncludeItemService {

    @Autowired
    IncludeItemMapper includeItemMapper;

    @Override
    public List<IncludeItem> queryAllByTourId(String id) {
        return includeItemMapper.selectByTourId(id);
    }

    @Override
    public void deleteById(String id) {
        int i = includeItemMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }
}
