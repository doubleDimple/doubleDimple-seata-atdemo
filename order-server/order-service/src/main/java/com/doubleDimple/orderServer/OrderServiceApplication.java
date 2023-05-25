package com.doubleDimple.orderServer;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.doubleDimple.orderServer.mapper")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.doubleDimple.stockApi.service"})
public class OrderServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class,args);
    }
}
