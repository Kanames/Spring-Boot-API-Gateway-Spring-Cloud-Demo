package com.medium.stefan.gatewayspringclouddemo.filters;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpMethod;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


public class CustomFilter implements GatewayFilter {

    private static Logger log = LoggerFactory.getLogger(CustomFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // Your filter logic here
        HttpMethod method = exchange.getRequest().getMethod();
        System.out.println("HTTP Method: " + method);
        log.info("Testing a theory about filters");
        return chain.filter(exchange);
    }
}
