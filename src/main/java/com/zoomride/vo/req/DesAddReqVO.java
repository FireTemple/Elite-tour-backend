package com.zoomride.vo.req;

import lombok.Data;

import java.util.List;

@Data
public class DesAddReqVO {

    private String userId;
    private String title;
    private String titleDes;
    private String includeDes;
    private String itemId;

    private List<String> includeItemsList;
}
