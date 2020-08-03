package com.zoomride.vo.req;

import lombok.Data;

@Data
public class SmallInfoAddReqVO {
    private String userId;
    private String itemId;
    private String type;
    private String imgUrl;
    private String title;
    private String des;
    private String cPrice;
    private String pPrice;
    private String delete = "1";
}
