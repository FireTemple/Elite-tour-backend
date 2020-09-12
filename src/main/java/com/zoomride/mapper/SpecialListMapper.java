package com.zoomride.mapper;

import com.zoomride.entity.SpecialList;
import com.zoomride.vo.resp.ClassifiedToursQueryRespVO;

import java.util.List;

public interface SpecialListMapper {
    int deleteByPrimaryKey(String id);

    int insert(SpecialList record);

    int insertSelective(SpecialList record);

    SpecialList selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SpecialList record);

    int updateByPrimaryKey(SpecialList record);

    List<ClassifiedToursQueryRespVO> selectClassifiedTours(String type);
}