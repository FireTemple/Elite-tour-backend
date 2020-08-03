package com.zoomride.service;

import com.zoomride.entity.Item;
import com.zoomride.vo.req.*;

import java.util.List;

public interface InformationService {


    String createItem(ItemAddReqVO itemAddReqVO);

    void addSmallInfo(SmallInfoAddReqVO smallInfoAddReqVO);

    void addDurationDetail(DurationDetailAddReqVO durationDetailAddReqVO);

    void addBigInfo(BigInfoAddReqVO bigInfoAddReqVO);

    void addBrefSchedule(BrefScheduleAddReqVO brefScheduleAddReqVO);

    void addDes(DesAddReqVO desAddReqVO);

    void addIncludeItem(IncludeItemAddReqVO includeItemAddReqVO);

    void addKind(String name);

    void addOpeningTime(OpeningTimeAddReqVO openingTimeAddReqVO);

    void addSchedule(ScheduleAddReqVO scheduleAddReqVO);

    //query
    List<Item> queryAllItems();
}
