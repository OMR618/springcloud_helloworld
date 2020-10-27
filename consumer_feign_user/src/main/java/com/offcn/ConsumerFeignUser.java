package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 19:43
 **/
@SpringBootApplication
@EnableDiscoveryClient //比@EnableEurekaClient范围更大，注册中心可以是其他组件
@EnableFeignClients //开启Feign
@EnableCircuitBreaker//开启熔断
@EnableHystrixDashboard//开启熔断监控
public class ConsumerFeignUser {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignUser.class);
    }
}
