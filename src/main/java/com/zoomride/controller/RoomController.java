package com.zoomride.controller;

import com.zoomride.service.impl.RoomServiceImpl;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "room controller")
@RequestMapping("/api")
public class RoomController {

    @Autowired
    RoomServiceImpl roomService;

    @GetMapping("/rooms/{id}")
    @ApiOperation("query rooms by hotels id")
    public DataResult queryByHotelsId(@PathVariable("id")String id){
        DataResult result = DataResult.success();

        result.setData(roomService.queryByHotelId(id));
        return result;
    }

    @DeleteMapping("/room/{id}")
    @ApiOperation("delete room by room Id")
    public DataResult deleteByRoomId(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        roomService.deleteById(id);
        return result;
    }

}
