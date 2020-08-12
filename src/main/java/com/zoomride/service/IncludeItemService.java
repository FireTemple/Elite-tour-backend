package com.zoomride.service;

import com.zoomride.entity.IncludeItem;

import java.util.List;

public interface IncludeItemService {

    List<IncludeItem> queryAllByTourId(String id);

    void deleteById(String id);
}
