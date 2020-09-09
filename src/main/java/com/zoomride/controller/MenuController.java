package com.zoomride.controller;

import com.zoomride.service.impl.MenuServiceImpl;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "menu controller")
@RequestMapping("/api")
public class MenuController {

    @Autowired
    MenuServiceImpl menuService;

    @GetMapping("/menu/{id}")
    @ApiOperation("query menus by restaurant id")
    public DataResult queryByResId(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        result.setData(menuService.queryByResId(id));
        return result;
    }

    @DeleteMapping("/menu/{id}")
    @ApiOperation("delete menu by id")
    public DataResult deleteById(@PathVariable("id") String id){
        DataResult result = DataResult.success();
        menuService.deleteById(id);
        return result;
    }
}
