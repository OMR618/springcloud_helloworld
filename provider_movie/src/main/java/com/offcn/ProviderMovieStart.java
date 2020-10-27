package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloud_helloworld
 * @description
 * @author: LiDuo
 * @create: 2020-10-21 16:23
 **/
@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
public class ProviderMovieStart {

    public static void main(String[] args) {
        SpringApplication.run(ProviderMovieStart.class);
    }

}
