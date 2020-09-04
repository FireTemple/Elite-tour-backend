package com.zoomride.service.impl;

import com.zoomride.entity.Menu;
import com.zoomride.entity.OpeningTime;
import com.zoomride.entity.Res;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.MenuMapper;
import com.zoomride.mapper.OpeningTimeMapper;
import com.zoomride.mapper.ResMapper;
import com.zoomride.service.ResService;
import com.zoomride.vo.req.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ResServiceImpl implements ResService {

    @Autowired
    ResMapper resMapper;

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    OpeningTimeMapper openingTimeMapper;

    @Override
    public List<Res> queryAll() {
        return resMapper.queryAll();
    }

    @Override
    public List<Res> queryAllActive() {
        return resMapper.queryAllActive();
    }

    @Override
    @Transactional
    public void addRes(ResAddReqVO resAddReqVO) {
        Res res = new Res();
        BeanUtils.copyProperties(resAddReqVO, res);
        String resId = UUID.randomUUID().toString();
        res.setId(resId);

        int i = resMapper.insertSelective(res);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

        for (MenuAddReqVO menuAddReqVO: resAddReqVO.getMenus()){
            Menu menu = new Menu();
            BeanUtils.copyProperties(menuAddReqVO, menu);
            menu.setId(UUID.randomUUID().toString());
            menu.setResId(resId);

            int i1 = menuMapper.insertSelective(menu);
            if (i1 != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
            }
        }

        for (OpeningTimeAddReqVO openingTimeAddReqVO: resAddReqVO.getOpeningTimeList()){
            OpeningTime openingTime = new OpeningTime();
            BeanUtils.copyProperties(openingTimeAddReqVO, openingTime);
            openingTime.setId(UUID.randomUUID().toString());
            openingTime.setResId(resId);

            int i1 = openingTimeMapper.insertSelective(openingTime);
            if (i1 != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
            }
        }
    }

    @Override
    @Transactional
    public void updateRes(ResUpdateReqVO resUpdateReqVO) {
        Res res = new Res();
        BeanUtils.copyProperties(resUpdateReqVO, res);

        for (MenuUpdateReqVO menuUpdateReqVO: resUpdateReqVO.getMenus()){
            Menu menu = new Menu();
            BeanUtils.copyProperties(menuUpdateReqVO, menu);
            if (menuUpdateReqVO.getId() == "" || menuUpdateReqVO.getId() == null){
                menu.setId(UUID.randomUUID().toString());
                menu.setResId(resUpdateReqVO.getId());
                int i = menuMapper.insertSelective(menu);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
                }
            } else {
                int i = menuMapper.updateByPrimaryKeySelective(menu);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
                }
            }
        }


        for (OpeningTimeUpdateReqVO openingTimeUpdateReqVO: resUpdateReqVO.getOpeningTimeList()){
            OpeningTime openingTime = new OpeningTime();
            BeanUtils.copyProperties(openingTimeUpdateReqVO, openingTime);

            if (openingTimeUpdateReqVO.getId() == "" || openingTimeUpdateReqVO.getId() == null){

                openingTime.setResId(resUpdateReqVO.getId());
                openingTime.setId(UUID.randomUUID().toString());
                int i = openingTimeMapper.insertSelective(openingTime);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
                }
            }else {
                int i = openingTimeMapper.updateByPrimaryKeySelective(openingTime);
                if (i != 1){
                    throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
                }
            }
        }

        int i = resMapper.updateByPrimaryKeySelective(res);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }


    }

    @Override
    public void deleteRes(String id) {
        int i = resMapper.deleteById(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_UPDATE);
        }
    }

    @Override
    public void waveResRecord(String id) {
        int i = resMapper.deleteByPrimaryKey(id);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_DELETE);
        }
    }

    @Override
    public Res queryById(String id) {
        return resMapper.selectByPrimaryKey(id);
    }
}
