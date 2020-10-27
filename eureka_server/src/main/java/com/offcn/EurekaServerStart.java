package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 15:28
 **/
@SpringBootApplication
@EnableEurekaServer//开启注册中心声明
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class);
    }
}
