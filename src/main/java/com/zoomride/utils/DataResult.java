package com.zoomride.utils;

import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.ResponseCodeInterface;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DataResult <T>{

    @ApiModelProperty(value = "response code,0 :success else: fail",name = "code")
    private int code = 0;

    @ApiModelProperty(value = "response message",name = "message")
    private String msg;

    @ApiModelProperty(value = "response data",name = "data")
    private T data;

    public DataResult(int code, T data) {
        this.code = code;
        this.data = data;
        this.msg=null;
    }

    public DataResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data=null;
    }

    public DataResult() {
        this.code= BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
        this.data=null;
    }
    public DataResult(T data) {
        this.data = data;
        this.code=BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
    }
    public DataResult(ResponseCodeInterface responseCodeInterface) {
        this.data = null;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }
    public DataResult(ResponseCodeInterface responseCodeInterface, T data) {
        this.data = data;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public static <T>DataResult success(){
        return new <T>DataResult();
    }

    public static <T>DataResult success(T data){
        return new <T>DataResult(data);
    }

    public static <T>DataResult getResult(int code,String msg,T data){
        return new <T>DataResult(code,msg,data);
    }

    public static <T>DataResult getResult(int code,String msg){
        return new <T>DataResult(code,msg);
    }

    public static <T>DataResult getResult(BaseResponseCode responseCode){
        return new <T>DataResult(responseCode);
    }

    public static <T>DataResult getResult(BaseResponseCode responseCode, T data){
        return new <T>DataResult(responseCode,data);
    }
}
