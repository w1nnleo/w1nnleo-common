package com.w1nnleo.exception.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.w1nnleo.exception.handler.GlobalCustomAdvice;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */

@Configuration
@EnableAutoConfiguration
public class GlobalCustomConfiguration {

    @Bean
    public GlobalCustomAdvice advice() {
        return new GlobalCustomAdvice();
    }

}
