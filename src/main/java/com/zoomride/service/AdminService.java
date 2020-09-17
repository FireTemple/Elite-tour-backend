package com.zoomride.service;


import com.zoomride.entity.Admin;
import com.zoomride.vo.req.LoginReqVO;

public interface AdminService {

    Admin Login(LoginReqVO loginReqVO);
}
