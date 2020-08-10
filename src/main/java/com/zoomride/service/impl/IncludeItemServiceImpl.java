package com.zoomride.service.impl;

import com.zoomride.entity.IncludeItem;
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
}
