package com.zoomride.vo.req;

import lombok.Data;

/**
 * @Project : elite-tour
 * @Author : Bohan Xiao
 * @Create : 2020-09-23
 **/

@Data
public class PageReqVO {


    private Integer pageNum = 1;

    private Integer pageSize = 10;

}
