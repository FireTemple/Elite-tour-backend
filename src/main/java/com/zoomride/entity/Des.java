package com.zoomride.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Des implements Serializable {
    private String id;

    private String title;

    private String titleDes;

    private String includeDes;

    private Date createTime;

    private Date updateTime;

    private String createId;

    private String updateId;

    private static final long serialVersionUID = 1L;

}