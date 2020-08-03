package com.zoomride.service.impl;

import com.zoomride.mapper.DurationDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DurationDetailService implements com.zoomride.service.DurationDetailService {

    @Autowired
    DurationDetailMapper durationDetailMapper;

    @Override
    public List<String> queryAll() {
        return null;
    }
}
