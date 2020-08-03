package com.zoomride.service;

import com.zoomride.vo.req.AdminLoginReqVO;
import com.zoomride.vo.resp.AdminLoginRespVO;

public interface AdminService {

    AdminLoginRespVO login(AdminLoginReqVO adminLoginReqVO);

}
