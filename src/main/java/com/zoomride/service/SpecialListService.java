package com.zoomride.service;

import com.zoomride.vo.req.SpecialListAddReqVO;
import com.zoomride.vo.resp.ClassifiedToursQueryRespVO;

import java.util.List;

public interface SpecialListService {


    void addRecord(SpecialListAddReqVO specialListAddReqVO);
    void deleteRecord(String id);

    List<ClassifiedToursQueryRespVO> findSpecialToursByType(String type);
}
