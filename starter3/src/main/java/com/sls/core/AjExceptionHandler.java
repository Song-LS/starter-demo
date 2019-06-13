package com.sls.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AjExceptionHandler {

    @ExceptionHandler(AjException2.class)
    public String ee(AjException2 e) {
        return e.getMessage();
    }
}
