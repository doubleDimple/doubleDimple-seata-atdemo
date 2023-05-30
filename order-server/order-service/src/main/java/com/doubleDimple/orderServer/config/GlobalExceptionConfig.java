package com.doubleDimple.orderServer.config;

import common.exception.exception.CustomException;
import common.response.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionConfig {
    @ExceptionHandler(CustomException.class)
    public Result<CustomException> handle(CustomException e){
        e.printStackTrace();
        return Result.fail(e.getCode(),e.getMessage());
    }

}
