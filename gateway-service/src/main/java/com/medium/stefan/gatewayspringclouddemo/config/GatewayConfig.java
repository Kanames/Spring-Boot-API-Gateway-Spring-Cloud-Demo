package com.medium.stefan.gatewayspringclouddemo.config;

import com.medium.stefan.gatewayspringclouddemo.filters.CustomFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public CustomFilter customFilter() {
        return new CustomFilter();
    }
}
