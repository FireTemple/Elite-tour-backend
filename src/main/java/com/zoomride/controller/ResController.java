package com.zoomride.controller;

import com.zoomride.service.impl.ResServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.ResAddReqVO;
import com.zoomride.vo.req.ResUpdateReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "restaurant controller")
@RestController
@RequestMapping("/api")
public class ResController {

    @Autowired
    ResServiceImpl resService;

    @GetMapping("/ress")
    @ApiOperation("query all restaurants")
    public DataResult queryAll() {
        DataResult result = DataResult.success();
        result.setData(resService.queryAll());
        return result;
    }

    @GetMapping("/ressActive")
    @ApiOperation("query all active restaurants")
    public DataResult queryAllActive() {
        DataResult result = DataResult.success();
        result.setData(resService.queryAllActive());
        return result;
    }

    @PostMapping("/res")
    @ApiOperation("create new restaurant")
    public DataResult addRes(@RequestBody ResAddReqVO resAddReqVO) {
        DataResult result = DataResult.success();
        resService.addRes(resAddReqVO);
        return result;
    }

    @PutMapping("/res")
    @ApiOperation("update a restaurant")
    public DataResult updateRes(@RequestBody ResUpdateReqVO resUpdateReqVO) {
        DataResult result = DataResult.success();
        resService.updateRes(resUpdateReqVO);
        return result;
    }

    @DeleteMapping("/res/{id}")
    @ApiOperation("wave a restaurant record")
    public DataResult waveResRecord(@PathVariable("id") String id) {
        DataResult result = DataResult.success();
        resService.waveResRecord(id);
        return result;
    }

    @PutMapping("/res/{id}")
    @ApiOperation("logical delete a restaurant")
    public DataResult deleteRes(@PathVariable("id") String id) {
        DataResult result = DataResult.success();
        resService.deleteRes(id);
        return result;
    }

    @GetMapping("/res/{id}")
    @ApiOperation("query by id")
    public DataResult queryById(@PathVariable("id") String id) {
        DataResult result = DataResult.success();
        result.setData(resService.queryById(id));
        return result;

    }

}
