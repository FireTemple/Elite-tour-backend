package com.zoomride.controller;

import com.zoomride.entity.Admin;
import com.zoomride.service.impl.AdminServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.LoginReqVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("user or admin login related")
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/login")
    @ApiOperation("login with username and password")
    public DataResult login(@RequestBody LoginReqVO loginReqVO){

        Admin admin = adminService.Login(loginReqVO);
        DataResult result = DataResult.success();
        result.setData(admin);
        return result;
    }

}
