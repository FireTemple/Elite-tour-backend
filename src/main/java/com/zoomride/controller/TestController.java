package com.zoomride.controller;


import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.utils.DataResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "test interface for configuration")
public class TestController {

    @GetMapping("/test")
    @ApiOperation(value = "Test swagger2")
    public String testSwagger2(){
        return "hello world";
    }

    @GetMapping("/home")
    @ApiOperation(value = "测试DataResult接口")
    public DataResult<String> getHome(){
        int i=1/0;
        DataResult<String> result =  DataResult.success("success!");
        return result;
    }

    @GetMapping("/business/error")
    @ApiOperation(value = "测试主动抛出业务异常接口")
    public DataResult<String> testBusinessError(@RequestParam String type){
        if(!type.equals("1")||type.equals("2")||type.equals("3")){
            throw new BusinessException(BaseResponseCode.DATA_ERROR);
        }
        DataResult<String> result = new DataResult(0,type);
        return result;
    }
}
