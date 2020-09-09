package com.zoomride.service;

import com.zoomride.entity.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> queryByResId(String id);
    void deleteById(String id);
}
