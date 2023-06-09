package com.doubleDimple.userServer.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.doubleDimple.users.exception.CustomException;
import com.doubleDimple.users.utils.Result;

@RestControllerAdvice
public class GlobalExceptionConfig{
    @ExceptionHandler(CustomException.class)
    public Result<CustomException> handle(CustomException e){
        e.printStackTrace();
        return Result.exception(e.getCode(),e.getMessage());
    }

}
