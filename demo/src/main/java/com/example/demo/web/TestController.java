package com.example.demo.web;

import com.aj.core.execptions.SlsExecption;
import com.sls.core.AjException2;
import com.sls.core.SlsException2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
public class TestController {

    @PostMapping("/test")
    public String test(String a) {
        if (a == null) {
            throw new SlsExecption("aaaaaa");
        }
        return "b";
    }

    @PostMapping("/test2")
    //现在没加注解，是失败的
    @ApiOperation(value = "测试2",httpMethod = "POST",response = ApiResponse.class)
    public String test2(String b) {
        if (b == null) {
            throw new SlsException2("111");
        }
        return "ok";
    }

    @PostMapping("/test3")
    public String test3(String c) {
        if (c == null) {
            throw new AjException2("gjnb");
        }
        return "oo";
    }
}

