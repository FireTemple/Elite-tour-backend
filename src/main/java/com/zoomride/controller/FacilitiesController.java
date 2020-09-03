package com.zoomride.controller;

import com.zoomride.service.FacilitiesService;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "facility controller")
public class FacilitiesController {

    @Autowired
    FacilitiesService facilitiesService;

    @GetMapping("/facilities/{id}")
    @ApiOperation("query by hotel id")
    public DataResult queryByHotelId(@PathVariable("id")String id){
        DataResult result = DataResult.success();
        result.setData(facilitiesService.queryByHotelId(id));
        return result;
    }
}
