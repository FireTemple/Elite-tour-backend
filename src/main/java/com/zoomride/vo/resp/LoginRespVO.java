package com.zoomride.vo.resp;

import lombok.Data;

/**
 * @Project : elite-tour
 * @Author : Bohan Xiao
 * @Create : 2020-09-23
 **/

@Data
public class LoginRespVO {

    private String accessToken;
    private String refreshToken;
    private String username;
    private String id;
    private String email;

}
