package com.sls.core.execptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sls
 **/
@ControllerAdvice
public class GlobaExceptionHandler {

    @ExceptionHandler(SlsException.class)
    @ResponseBody
    public String handler(SlsException e) {
        return e.getMessage();
    }
}
