package com.zoomride.service.impl;

import com.zoomride.entity.*;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.*;
import com.zoomride.service.InformationService;
import com.zoomride.vo.req.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    SmallInfoMapper smallInfoMapper;

    @Autowired
    ItemMapper itemMapper;

    @Autowired
    DurationDetailMapper durationDetailMapper;

    @Autowired
    BigInfoMapper bigInfoMapper;

    @Autowired
    BrifScheduleMapper brifScheduleMapper;

    @Autowired
    DesMapper desMapper;

    @Autowired
    IncludeItemMapper includeItemMapper;

    @Autowired
    DesIncludeItemMapper desIncludeItemMapper;

    @Autowired
    KindMapper kindMapper;

    @Autowired
    OpeningTimeMapper openingTimeMapper;

    @Autowired
    ScheduleMapper scheduleMapper;

    @Override
    public String createItem(ItemAddReqVO itemAddReqVO) {

        Item item = new Item();
        BeanUtils.copyProperties(itemAddReqVO, item);
        String itemId = UUID.randomUUID().toString();
        item.setId(itemId);
        // set Id
        item.setCreateId(itemAddReqVO.getUserId());
        item.setUpdateId(itemAddReqVO.getUserId());

        // set create time
        Date createTime = new Date();
        item.setCreateTime(createTime);
        item.setUpdateTime(createTime);

        int i = itemMapper.insertSelective(item);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

        return itemId;
    }

    @Override
    public void addSmallInfo(SmallInfoAddReqVO smallInfoAddReqVO) {
        SmallInfo smallInfo = new SmallInfo();
        BeanUtils.copyProperties(smallInfoAddReqVO, smallInfo);
        // set ID
        smallInfo.setId(smallInfoAddReqVO.getItemId());
        // set create user
        smallInfo.setCreateId(smallInfoAddReqVO.getUserId());
        smallInfo.setUpdateId(smallInfoAddReqVO.getUserId());
        // set time
        Date createTime = new Date();
        smallInfo.setCreateTime(createTime);
        smallInfo.setUpdateTime(createTime);

        int i = smallInfoMapper.insertSelective(smallInfo);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

    }

    @Override
    public void addDurationDetail(DurationDetailAddReqVO durationDetailAddReqVO) {
        DurationDetail durationDetail = new DurationDetail();

        durationDetail.setContent(durationDetailAddReqVO.getContent());
        durationDetail.setId(UUID.randomUUID().toString());

        durationDetail.setCreateId(durationDetailAddReqVO.getUserId());
        durationDetail.setUpdateId(durationDetailAddReqVO.getUserId());

        Date date = new Date();

        durationDetail.setCreateTime(date);
        durationDetail.setUpdateTime(date);

        int i = durationDetailMapper.insertSelective(durationDetail);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void addBigInfo(BigInfoAddReqVO bigInfoAddReqVO) {
        BigInfo bigInfo = new BigInfo();
        BeanUtils.copyProperties(bigInfoAddReqVO, bigInfo);

        bigInfo.setId(bigInfoAddReqVO.getItemId());

        bigInfo.setUpdateId(bigInfoAddReqVO.getUserId());
        bigInfo.setCreateId(bigInfoAddReqVO.getUserId());

        Date date = new Date();

        bigInfo.setCreateTime(date);
        bigInfo.setUpdateTime(date);

        int i = bigInfoMapper.insertSelective(bigInfo);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

    }

    @Override
    public void addBrefSchedule(BrefScheduleAddReqVO brefScheduleAddReqVO) {
        BrifSchedule brifSchedule = new BrifSchedule();
        BeanUtils.copyProperties(brefScheduleAddReqVO, brifSchedule);

        brifSchedule.setId(brefScheduleAddReqVO.getItemId());

        int i = brifScheduleMapper.insertSelective(brifSchedule);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }

    }

    @Override
    public void addDes(DesAddReqVO desAddReqVO) {
        Des des = new Des();
        BeanUtils.copyProperties(desAddReqVO,des);

        des.setId(desAddReqVO.getItemId());

        des.setCreateId(desAddReqVO.getUserId());
        des.setUpdateId(desAddReqVO.getUserId());

        Date date = new Date();
        des.setCreateTime(date);
        des.setUpdateTime(date);


        for (String includeItemId : desAddReqVO.getIncludeItemsList()){
            DesIncludeItem desIncludeItem = new DesIncludeItem();
            desIncludeItem.setId(UUID.randomUUID().toString());
            desIncludeItem.setDesId(desAddReqVO.getItemId());
            desIncludeItem.setIncludeItemId(includeItemId);
            int i = desIncludeItemMapper.insertSelective(desIncludeItem);
            if (i != 1){
                throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT_MID_TIER);
            }
        }

        int i = desMapper.insertSelective(des);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void addIncludeItem(IncludeItemAddReqVO includeItemAddReqVO) {
        IncludeItem includeItem = new IncludeItem();
        BeanUtils.copyProperties(includeItemAddReqVO, includeItem);
        includeItem.setId(UUID.randomUUID().toString());

        includeItem.setCreateId(includeItemAddReqVO.getUserId());
        includeItem.setUpdateId(includeItemAddReqVO.getUserId());

        Date date = new Date();

        includeItem.setCreateTime(date);
        includeItem.setUpdateTime(date);

        int i = includeItemMapper.insertSelective(includeItem);

        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void addKind(String name) {
        Kind kind = new Kind();
        kind.setName(name);
        kind.setId(UUID.randomUUID().toString());

        int i = kindMapper.insertSelective(kind);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void addOpeningTime(OpeningTimeAddReqVO openingTimeAddReqVO) {
        OpeningTime openingTime = new OpeningTime();
        BeanUtils.copyProperties(openingTimeAddReqVO, openingTime);

        openingTime.setCreateId(openingTimeAddReqVO.getItemId());
        openingTime.setUpdateId(openingTimeAddReqVO.getItemId());

        openingTime.setId(openingTimeAddReqVO.getItemId());

        Date date = new Date();

        openingTime.setUpdateTime(date);
        openingTime.setCreateTime(date);

        int i = openingTimeMapper.insertSelective(openingTime);
        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    @Override
    public void addSchedule(ScheduleAddReqVO scheduleAddReqVO) {
        Schedule schedule = new Schedule();
        BeanUtils.copyProperties(scheduleAddReqVO, schedule);
        schedule.setId(UUID.randomUUID().toString());

        schedule.setCreateId(scheduleAddReqVO.getUserId());
        schedule.setUpdateId(scheduleAddReqVO.getUserId());

        Date date = new Date();
        schedule.setCreateTime(date);
        schedule.setUpdateTime(date);
        int i = scheduleMapper.insertSelective(schedule);

        if (i != 1){
            throw new BusinessException(BaseResponseCode.DATABASE_ERROR_INSERT);
        }
    }

    /**
     * query information
     */
    @Override
    public List<Item> queryAllItems(){
        return itemMapper.queryAll();
    }
}
