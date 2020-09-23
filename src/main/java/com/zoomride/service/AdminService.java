package com.zoomride.service;


import com.zoomride.vo.req.LoginReqVO;
import com.zoomride.vo.resp.LoginRespVO;

public interface AdminService {

    LoginRespVO Login(LoginReqVO loginReqVO);

    void logout(String accessToken, String refreshToken);
}
