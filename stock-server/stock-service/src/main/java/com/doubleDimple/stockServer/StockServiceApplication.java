package com.doubleDimple.stockServer;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.doubleDimple.stockServer.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class StockServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(StockServiceApplication.class,args);
    }
}
