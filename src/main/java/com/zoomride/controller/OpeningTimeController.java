package com.zoomride.controller;

import com.zoomride.service.impl.OpeningTimeServiceImpl;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "opening time controller")
@RequestMapping("/api")
public class OpeningTimeController {

    @Autowired
    OpeningTimeServiceImpl openingTimeService;

    @GetMapping("/opening-time/{id}")
    @ApiOperation("query opening time by restaurant id")
    public DataResult queryByResId(@PathVariable("id") String id){

        DataResult result = DataResult.success();
        result.setData(openingTimeService.queryByResId(id));
        return result;
    }

    @DeleteMapping("/opening-time/{id}")
    @ApiOperation("delete query opening time by restaurant id")
    public DataResult deleteById(String id){
        DataResult result = DataResult.success();
        openingTimeService.deleteById(id);
        return result;
    }
}
