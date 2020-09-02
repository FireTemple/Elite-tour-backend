package com.zoomride.controller;

import com.zoomride.entity.Tour;
import com.zoomride.service.impl.TourServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.TourAddReqVO;
import com.zoomride.vo.req.TourUpdateReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(tags = "tour controller")
public class TourController {
    @Autowired
    TourServiceImpl tourService;

    @GetMapping("/tours")
    @ApiOperation(value = "query all tours")
    public DataResult queryAllTour(){

        DataResult dataResult = DataResult.success();
        List<Tour> tours = tourService.queryAll();
        dataResult.setData(tours);
        return dataResult;

    }

    @GetMapping("/acTours")
    @ApiOperation(value = "query All active tours")
    public DataResult queryAllActiveTour(){
        DataResult dataResult = DataResult.success();

        dataResult.setData(tourService.queryAllActive());
        return dataResult;
    }

    @GetMapping("/tour/{id}")
    @ApiOperation(value = "query tour by it's id")
    public DataResult queryTour(@PathVariable("id") String id){

        DataResult dataResult = DataResult.success();
        Tour tour = tourService.queryTour(id);

        dataResult.setData(tour);
        return dataResult;

    }

    @PostMapping("/tour")
    @ApiOperation(value = "Add a tour")
    public DataResult AddTour(@RequestBody TourAddReqVO  tourAddReqVO){

        DataResult result = DataResult.success();
        tourService.addTour(tourAddReqVO);
        return result;
    }

    @PutMapping("/tour")
    @ApiOperation(value = "update a tour")
    public DataResult updateTour(@RequestBody TourUpdateReqVO tourUpdateReqVO){

        DataResult result = DataResult.success();
        tourService.updateTour(tourUpdateReqVO);
        return result;
    }

    @PutMapping("/tour/{id}")
    @ApiOperation(value = "delete a tour")
    public DataResult deleteTour(@PathVariable("id") String id){

        DataResult result = DataResult.success();
        tourService.deleteTour(id);
        return result;
    }

    @DeleteMapping("/tour/{id}")
    @ApiOperation(value = "wave data from data base (sensitive operation)")
    public DataResult waveTour(@PathVariable("id")String id){
        DataResult result = DataResult.success();
        tourService.waveTour(id);
        return result;
    }

}
