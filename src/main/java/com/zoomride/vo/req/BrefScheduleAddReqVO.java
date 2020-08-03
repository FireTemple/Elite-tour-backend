package com.zoomride.vo.req;

import lombok.Data;

@Data
public class BrefScheduleAddReqVO {

    private String userId;
    private String itemId;
    private String address;
    private String mo;
    private String tu;
    private String we;
    private String th;
    private String fr;
    private String sa;
    private String su;
}
