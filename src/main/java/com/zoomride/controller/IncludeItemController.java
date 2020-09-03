package com.zoomride.controller;

import com.zoomride.entity.IncludeItem;
import com.zoomride.service.impl.IncludeItemServiceImpl;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(tags = "item controller")
public class IncludeItemController {

    @Autowired
    IncludeItemServiceImpl includeItemService;

    @GetMapping("/includeItem/{id}")
    @ApiOperation("query all includeitem that belongs to the tour")
    public DataResult<List<IncludeItem>> queryIncludeItemsByTourId(@PathVariable("id")String id){
        DataResult<List<IncludeItem>>  result = DataResult.success();
        result.setData(includeItemService.queryAllByTourId(id));
        return result;
    }

    @DeleteMapping("/includeItem/{id}")
    @ApiOperation("delete includeItem by id")
    public DataResult deleteIncludeItemById(@PathVariable("id")String id){
        DataResult result = DataResult.success();
        includeItemService.deleteById(id);
        return result;
    }
}
