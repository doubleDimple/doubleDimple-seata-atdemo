package com.doubleDimple.stockServer.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import stock.exception.exception.CustomException;
import stock.response.Result;

@RestControllerAdvice
public class GlobalExceptionConfig {
    @ExceptionHandler(CustomException.class)
    public Result<CustomException> handle(CustomException e){
        e.printStackTrace();
        return Result.fail(e.getCode(),e.getMessage());
    }

}
