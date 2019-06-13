package com.sls.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author sls
 **/
@Data
@Component
@EnableConfigurationProperties
@ConfigurationProperties("cn.sls")
public class Sls {
    private String name;
}
