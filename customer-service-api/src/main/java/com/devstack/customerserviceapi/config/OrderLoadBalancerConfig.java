package com.devstack.customerserviceapi.config;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

@LoadBalancerClient(value = "order-service-api")
public class OrderLoadBalancerConfig {
    @LoadBalanced
    @Bean
    public Feign.Builder feBuilder(){
        return Feign.builder();
    }
}
