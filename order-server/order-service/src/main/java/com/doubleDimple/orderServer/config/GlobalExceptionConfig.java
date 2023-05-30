package com.doubleDimple.orderServer.config;

import common.exception.exception.CustomException;
import common.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionConfig {
    @ExceptionHandler(CustomException.class)
    public Result<CustomException> handle(CustomException e){
        e.printStackTrace();
        log.info("出粗了:{{}}",e);
        return Result.fail(e.getCode(),e.getMessage());
    }

}
