package com.doubleDimple.userServer.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.doubleDimple.users.exception.MyException;
import com.doubleDimple.users.utils.Result;

@RestControllerAdvice
public class GlobalExceptionConfig{
    @ExceptionHandler(MyException.class)
    public Result<MyException> handle(MyException e){
        e.printStackTrace();
        return Result.exception(e.getCode(),e.getMessage());
    }

}
