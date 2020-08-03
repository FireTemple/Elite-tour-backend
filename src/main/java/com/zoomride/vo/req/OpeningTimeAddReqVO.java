package com.zoomride.vo.req;

import lombok.Data;

@Data
public class OpeningTimeAddReqVO {

    private String userId;
    private String itemId;
    private String title;
    private String mo;
    private String tu;
    private String we;
    private String th;
    private String fr;
    private String sa;
    private String su;
}
