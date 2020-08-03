package com.zoomride.controller;

import com.zoomride.service.impl.AdminServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.AdminLoginReqVO;
import com.zoomride.vo.resp.AdminLoginRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "User controller")
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/login")
    @ApiOperation(value = "admin user login")
    public DataResult<AdminLoginRespVO> login(@RequestBody AdminLoginReqVO adminLoginReqVO){

        DataResult<AdminLoginRespVO> result = DataResult.success();

        result.setData(adminService.login(adminLoginReqVO));

        return result;
    }



}
