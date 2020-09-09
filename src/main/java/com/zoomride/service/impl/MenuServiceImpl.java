package com.zoomride.service.impl;

import com.zoomride.entity.Menu;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.MenuMapper;
import com.zoomride.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<Menu> queryByResId(String id) {
        return menuMapper.queryByResId(id);
    }

    @Override
    public void deleteById(String id) {
        int i = menuMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }
}
