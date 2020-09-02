package com.zoomride.controller;

import com.zoomride.service.impl.HotelServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.HotelAddReqVO;
import com.zoomride.vo.req.HotelUpdateReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "hotel controller")
@RequestMapping("/api")
public class HotelController {

    @Autowired
    HotelServiceImpl hotelService;

    @GetMapping("/hotels")
    @ApiOperation("query all hotels")
    public DataResult queryAll() {
        DataResult result = DataResult.success();
        result.setData(hotelService.queryAll());
        return result;
    }

    @GetMapping("/acHotels")
    @ApiOperation("query all active hotels")
    public DataResult queryAllActive() {
        DataResult result = DataResult.success();
        result.setData(hotelService.queryAllActive());
        return result;
    }

    @GetMapping("/hotel/{id}")
    @ApiOperation("query a hotel by id")
    public DataResult queryById(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        result.setData(hotelService.queryHotel(id));
        return result;
    }

    @PostMapping("/hotel")
    @ApiOperation("add a new hotel")
    public DataResult addHotel(@RequestBody HotelAddReqVO hotelAddReqVO) {
        DataResult result = DataResult.success();
        hotelService.addHotel(hotelAddReqVO);
        return result;
    }

    @DeleteMapping("/hotel/{id}")
    @ApiOperation("wave a hotel record from database")
    public DataResult waveHotel(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        hotelService.waveHotel(id);
        return result;
    }

    @PutMapping("/hotel")
    @ApiOperation("update a hotel info")
    public DataResult updateHotel(@RequestBody HotelUpdateReqVO hotelUpdateReqVO){
        DataResult result = DataResult.success();
        hotelService.updateHotel(hotelUpdateReqVO);
        return  result;
    }

    @PutMapping("/hotel/{id}")
    public DataResult deleteHotel(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        hotelService.deleteHotel(id);
        return result;
    }

}
