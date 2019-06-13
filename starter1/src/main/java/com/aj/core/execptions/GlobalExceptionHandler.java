package com.aj.core.execptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SlsExecption.class)
    @ResponseBody
    public String handler(SlsExecption e) {
        return e.getMessage();
    }
}
