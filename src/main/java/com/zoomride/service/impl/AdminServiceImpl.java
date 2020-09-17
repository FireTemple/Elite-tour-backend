package com.zoomride.service.impl;

import com.zoomride.entity.Admin;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.AdminMapper;
import com.zoomride.service.AdminService;
import com.zoomride.vo.req.LoginReqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin Login(LoginReqVO loginReqVO) {

        Admin admin = adminMapper.isUserExist(loginReqVO.getUsername());
        if (admin == null){
            throw new BusinessException(BaseResponseCode.LOGIN_ERROR_USER_NOT_EXIST);
        }

        if (!admin.getPassword().equals(loginReqVO.getPassword())){
            throw new BusinessException(BaseResponseCode.LOGIN_ERROR_PASSWORD_NOT_MATCH);
        }

        return admin;
    }
}
