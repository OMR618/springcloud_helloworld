package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 17:15
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//开启熔断
public class ConsumerUserStart {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserStart.class);
    }

    @LoadBalanced //开启负载均衡 默认负载均衡策略：轮循
    @Bean  //<bean id="" class=""......
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
