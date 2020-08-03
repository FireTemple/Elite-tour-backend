package com.zoomride.vo.req;

import lombok.Data;

@Data
public class ScheduleAddReqVO {

    private String itemId;
    private String Duration;
    private String mo;
    private String tu;
    private String we;
    private String th;
    private String fr;
    private String sa;
    private String su;
    private String userId;
}
