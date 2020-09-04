package com.zoomride.vo.req;

import lombok.Data;

@Data
public class OpeningTimeAddReqVO {
    private String resId;

    private String title;

    private String mo;

    private String tu;

    private String we;

    private String th;

    private String fri;

    private String sa;

    private String su;
}
