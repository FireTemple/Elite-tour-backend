package com.zoomride.service.impl;

import com.zoomride.constants.Constant;
import com.zoomride.entity.Admin;
import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.mapper.AdminMapper;
import com.zoomride.service.AdminService;
import com.zoomride.utils.JwtTokenUtil;
import com.zoomride.vo.req.LoginReqVO;
import com.zoomride.vo.resp.LoginRespVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    RedisService redisService;

    @Override
    public LoginRespVO Login(LoginReqVO loginReqVO) {

        Admin admin = adminMapper.isUserExist(loginReqVO.getUsername());
        if (admin == null){
            throw new BusinessException(BaseResponseCode.LOGIN_ERROR_USER_NOT_EXIST);
        }

        if (!admin.getPassword().equals(loginReqVO.getPassword())){
            throw new BusinessException(BaseResponseCode.LOGIN_ERROR_PASSWORD_NOT_MATCH);
        }

        LoginRespVO loginRespVO = new LoginRespVO();
        BeanUtils.copyProperties(admin, loginRespVO);

        Map<String, Object> claims = new HashMap<>();

        claims.put(Constant.JWT_PERMISSIONS_KEY, getPermissionsByUserId(admin.getId()));
        claims.put(Constant.JWT_ROLES_KEY, getRolesByUserId(admin.getId()));
        claims.put(Constant.JWT_USER_NAME, admin.getUsername());

        String accessToken = JwtTokenUtil.getAccessToken(admin.getId(), claims);
        String refreshToken = JwtTokenUtil.getRefreshToken(admin.getId(), claims);

        loginRespVO.setAccessToken(accessToken);
        loginRespVO.setRefreshToken(refreshToken);

        return loginRespVO;
    }

    @Override
    public void logout(String accessToken, String refreshToken) {
        if (accessToken.isEmpty() || refreshToken.isEmpty()){
            throw new BusinessException(BaseResponseCode.DATA_ERROR_TOKEN_MISSING);
        }

        Subject subject = SecurityUtils.getSubject();

        log.info("user id is ={}", subject.getPrincipal());

        if (subject.isAuthenticated()){
            subject.logout();
        }

        String userId = JwtTokenUtil.getUserId(accessToken);

        /**
         *  Add token to black list
         */
        redisService.set(Constant.JWT_ACCESS_TOKEN_BLACKLIST + userId, userId, JwtTokenUtil.getRemainingTime(accessToken), TimeUnit.MILLISECONDS);

        /**
         * Add refresh token to black list
         */
        redisService.set(Constant.JWT_REFRESH_TOKEN_BLACKLIST + userId, userId, JwtTokenUtil.getRemainingTime(accessToken), TimeUnit.MILLISECONDS);

    }

    /**
     *  get roles
     */

    private List<String> getRolesByUserId(String userId){
        List<String> roles = new ArrayList<>();
        if (userId.equals("1")){
            roles.add("admin");
        }else {
            roles.add("test");
        }
        return roles;
    }

    /**
     *  get permission
     */

    private List<String> getPermissionsByUserId(String userId){
        List<String> permissions = new ArrayList<>();

        if (userId.equals("1")){
            permissions.add("tour:user:add");
            permissions.add("tour:user:delete");
            permissions.add("tour:user:update");
            permissions.add("tour:user:list");
            permissions.add("tour:user:detail");
        }else {
            permissions.add("tour:user:list");
        }
        return permissions;
    }
}
