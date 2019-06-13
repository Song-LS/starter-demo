package com.example.demo;

import com.sls.core.EnableSls;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSls
//可以放启动类，也可以放其他类
//@EnableSwagger
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
