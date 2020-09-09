package com.zoomride.service;

import com.zoomride.entity.OpeningTime;

import java.util.List;

public interface OpeningTimeService {

    List<OpeningTime> queryByResId(String id);

    void deleteById(String id);
}
