package com.zoomride.service;

import com.zoomride.entity.Res;
import com.zoomride.vo.req.ResAddReqVO;
import com.zoomride.vo.req.ResUpdateReqVO;

import java.util.List;

public interface ResService {

    List<Res> queryAll();
    List<Res> queryAllActive();

    void addRes(ResAddReqVO resAddReqVO);
    void updateRes(ResUpdateReqVO resUpdateReqVO);
    void deleteRes(String id);
    void waveResRecord(String id);
    Res queryById(String id);
}
