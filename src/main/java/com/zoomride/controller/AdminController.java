package com.zoomride.controller;

import com.zoomride.service.impl.AdminServiceImpl;
import com.zoomride.utils.DataResult;
import com.zoomride.vo.req.LoginReqVO;
import com.zoomride.vo.resp.LoginRespVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@Api("user or admin login related")
@RequestMapping("/api/admin")
@Slf4j
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/login")
    @ApiOperation("login with username and password")
    public DataResult login(@RequestBody LoginReqVO loginReqVO){

        LoginRespVO loginRespVO = adminService.Login(loginReqVO);
        DataResult result = DataResult.success();
        result.setData(loginRespVO);
        return result;
    }

    @GetMapping("/logout")
    @ApiOperation("admin user log out")
    public DataResult logout(HttpServletRequest request){
        try {
            String accessToken = request.getHeader("accessToken");
            String refreshToken = request.getHeader("refreshToken");
            adminService.logout(accessToken, refreshToken);
        } catch (Exception e){
            log.error("log out error {}", e);
        }
        return DataResult.success();
    }

}
