package com.sls.core.config;

import com.sls.core.execptions.GlobaExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sls
 **/
@Configuration
public class ExceptionConfiguration {

    @Bean
    public GlobaExceptionHandler globaExceptionHandler() {
        return new GlobaExceptionHandler();
    }
}
