package com.learn.cloud.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author kaixin_k
 * @version 1.0
 * @title Application
 * @description
 * @date 2021/4/25 16:03
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CounsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CounsumerApplication.class,args);
    }
}
