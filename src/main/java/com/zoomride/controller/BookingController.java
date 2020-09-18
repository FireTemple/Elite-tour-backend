package com.zoomride.controller;

import com.zoomride.service.impl.BookingServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.BookingAddReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api("booking controller")
@RequestMapping("/api")
public class BookingController {

    @Autowired
    BookingServiceImpl bookingService;

    @GetMapping("/booking")
    @ApiOperation("query all booking order")
    public DataResult queryAllBookingOrder(){
        DataResult result = DataResult.success();
        result.setData(bookingService.queryAll());
        return result;
    }

    @PostMapping("/booking")
    @ApiOperation("add a new order")
    public DataResult addNewOrder(@RequestBody BookingAddReqVO bookingAddReqVO){
        DataResult result = DataResult.success();
        bookingService.addBookingOrder(bookingAddReqVO);
        return result;
    }

    @DeleteMapping("/booking/{id}")
    @ApiOperation("delete a record by id")
    public DataResult waveData(@PathVariable("id")String id){
        DataResult result = DataResult.success();
        bookingService.deleteBookingOrder(id);
        return result;
    }

    @PutMapping("/booking/{id}")
    @ApiOperation("change the status of the record")
    public DataResult changeStatus(@PathVariable("id")String id, String status){

        DataResult result = DataResult.success();
        bookingService.canceledOrder(id, status);
        return result;
    }

}
