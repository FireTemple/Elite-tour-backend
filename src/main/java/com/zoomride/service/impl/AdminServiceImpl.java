package com.zoomride.service.impl;

import com.zoomride.entity.Admin;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.AdminMapper;
import com.zoomride.service.AdminService;
import com.zoomride.vo.req.AdminLoginReqVO;
import com.zoomride.vo.resp.AdminLoginRespVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public AdminLoginRespVO login(AdminLoginReqVO adminLoginReqVO) {

        Admin admin = adminMapper.selectByUsername(adminLoginReqVO.getUsername());
        System.out.println(adminLoginReqVO.getPassword());
        if (admin == null){
            throw new BusinessException(400000,"username dose not exist");
        }
        if (!admin.getPassword().equals(adminLoginReqVO.getPassword())){
            throw new BusinessException(400001,"password is incorrect");
        }


        AdminLoginRespVO adminLoginRespVO = new AdminLoginRespVO();
        BeanUtils.copyProperties(admin, adminLoginRespVO);

        return adminLoginRespVO;
    }
}
