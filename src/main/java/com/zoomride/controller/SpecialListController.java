package com.zoomride.controller;

import com.zoomride.service.impl.SpecialListServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.SpecialListAddReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("special list controller")
@RequestMapping("/api")
public class SpecialListController {

    @Autowired
    SpecialListServiceImpl specialListService;

    @PostMapping("/special-list")
    @ApiOperation("add a item to special list")
    public DataResult addRecord(@RequestBody SpecialListAddReqVO specialListAddReqVO){
        DataResult result = DataResult.success();
        specialListService.addRecord(specialListAddReqVO);
        return result;
    }

    @DeleteMapping("/special-list/{id}")
    @ApiOperation("delete a special list record")
    public DataResult deleteRecord(@PathVariable("id")String id){
        DataResult result = DataResult.success();
        specialListService.deleteRecord(id);
        return result;
    }

    @GetMapping("/special-list/tours/{type}")
    @ApiOperation("find tours by type")
    public DataResult querySpecialToursByType(@PathVariable("type") String type){
        DataResult result = DataResult.success();
        result.setData(specialListService.findSpecialToursByType(type));
        return result;
    }
}
