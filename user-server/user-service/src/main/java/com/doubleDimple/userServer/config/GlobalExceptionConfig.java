package com.doubleDimple.userServer.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import users.exception.MyException;
import users.utils.Result;

import static javafx.scene.input.KeyCode.R;

@RestControllerAdvice
public class GlobalExceptionConfig{
    @ExceptionHandler(MyException.class)
    public Result<MyException> handle(MyException e){
        e.printStackTrace();
        return Result.exception(e.getCode(),e.getMessage());
    }

}
