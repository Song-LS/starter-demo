package com.sls.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cn.sls")
@EnableConfigurationProperties
@Data
public class Sls {

    private String name;
}
