package com.zoomride.exception;

public enum  BaseResponseCode implements ResponseCodeInterface {

    SUCCESS(0, "Operation success"),
    SYSTEM_BUSY(100000,"System error,pleases try later"),
    DATA_ERROR(200000,"Input data error"),
    DATA_ERROR_TOKEN_MISSING(200001, "Login Token Missing"),
    DATABASE_ERROR_INSERT(300001,"Insert error"),
    DATABASE_ERROR_UPDATE(300002,"Update error"),
    DATABASE_ERROR_DELETE(300003,"Delete error"),
    DATABASE_ERROR_INSERT_MID_TIER(300004,"Middle Table Insert Error"),
    LOGIN_ERROR_USER_NOT_EXIST(400001,"username don't exist"),
    LOGIN_ERROR_PASSWORD_NOT_MATCH(400001, "password dose not match."),
            ;

    private final int code;

    private final String msg;

    BaseResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
