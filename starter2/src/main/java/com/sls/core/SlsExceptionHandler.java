package com.sls.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SlsExceptionHandler {

    @ExceptionHandler(SlsException2.class)
    public String ee(SlsException2 e) {
        return e.getMessage();
    }
}
