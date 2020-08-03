package com.zoomride.exception.handler;

import com.zoomride.exception.BaseResponseCode;
import com.zoomride.exception.BusinessException;
import com.zoomride.utils.DataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public <T> DataResult<T> handleException(Exception e){

        return DataResult.getResult(BaseResponseCode.SYSTEM_BUSY);
    }

    @ExceptionHandler(value = BusinessException.class)
    <T> DataResult<T> businessExceptionHandler(BusinessException e) {
        return new DataResult<>(e.getCode(),e.getDefaultMessage());
    }
}
