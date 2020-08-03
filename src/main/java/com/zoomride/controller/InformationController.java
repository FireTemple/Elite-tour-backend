package com.zoomride.controller;

import com.zoomride.service.impl.InformationServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "all information-related operations including CRUD")
@RequestMapping("/api")
public class InformationController {

    @Autowired
    InformationServiceImpl informationService;


    /**
     * add infomration
     * @param smallInfoAddReqVO
     * @return
     */

    @PostMapping("/smallInfo")
    @ApiOperation(value = "add small info")
    public DataResult addSmallInfo(@RequestBody SmallInfoAddReqVO smallInfoAddReqVO){

        DataResult result = DataResult.success();
        informationService.addSmallInfo(smallInfoAddReqVO);
        return result;
    }

    @PostMapping("/item")
    @ApiOperation(value = "create a new item")
    public DataResult<String> addSmallInfo(@RequestBody ItemAddReqVO itemAddReqVO){

        DataResult<String> result = DataResult.success();
        String itemId = informationService.createItem(itemAddReqVO);
        result.setData(itemId);

        return result;
    }

    @PostMapping("/durationDetail")
    @ApiOperation(value = "add  new duration detail(time duration eg:9:00 to 10:00)")
    public DataResult<String> addSDurationDetail(@RequestBody DurationDetailAddReqVO durationDetailAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addDurationDetail(durationDetailAddReqVO);

        return result;
    }

    @PostMapping("/bigInfo")
    @ApiOperation(value = "add  big information in the item detail page")
    public DataResult addBigInfo(@RequestBody BigInfoAddReqVO bigInfoAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addBigInfo(bigInfoAddReqVO);

        return result;
    }

    @PostMapping("/brif")
    @ApiOperation(value = "add short schedule and adress in the icon")
    public DataResult addBrif(@RequestBody BrefScheduleAddReqVO brefScheduleAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addBrefSchedule(brefScheduleAddReqVO);

        return result;
    }

    @PostMapping("/des")
    @ApiOperation(value = "add description for a item")
    public DataResult addDes(@RequestBody DesAddReqVO desAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addDes(desAddReqVO);

        return result;
    }

    @PostMapping("/includeItem")
    @ApiOperation(value = "add a include item(service will provide in this item)")
    public DataResult addIncludeItem(@RequestBody IncludeItemAddReqVO includeItemAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addIncludeItem(includeItemAddReqVO);

        return result;
    }

    @PostMapping("/kind")
    @ApiOperation(value = "add a kind(This is the kind of this type of item, like short tour)")
    public DataResult addKind(String name){

        DataResult<String> result = DataResult.success();
        informationService.addKind(name);

        return result;
    }

    @PostMapping("/openingTime")
    @ApiOperation(value = "add a opening time")
    public DataResult addOpeningTime(@RequestBody OpeningTimeAddReqVO openingTimeAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addOpeningTime(openingTimeAddReqVO);

        return result;
    }

    @PostMapping("/schedule")
    @ApiOperation(value = "add a schedule (this schedule is in the detail page, and one item may have mutiple schedule)")
    public DataResult addSchedule(@RequestBody ScheduleAddReqVO scheduleAddReqVO){

        DataResult<String> result = DataResult.success();
        informationService.addSchedule(scheduleAddReqVO);

        return result;
    }

    /**
     * query information
     */
    @GetMapping("/items")
    @ApiOperation("Test: query all item information")
    public DataResult queryAllItem(){
        DataResult result = DataResult.success();
        result.setData(informationService.queryAllItems());
        return result;
    }


}
