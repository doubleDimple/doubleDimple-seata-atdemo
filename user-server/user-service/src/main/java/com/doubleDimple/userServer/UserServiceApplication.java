package com.doubleDimple.userServer;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.doubleDimple.userServer.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
