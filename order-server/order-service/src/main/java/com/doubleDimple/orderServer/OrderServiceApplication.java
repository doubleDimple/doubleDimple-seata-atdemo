package com.doubleDimple.orderServer;

import com.doubleDimple.stockApi.service.StockFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.doubleDimple.orderServer.mapper")
@EnableDiscoveryClient
@EnableFeignClients(clients = {StockFeignApi.class})
@Slf4j
public class OrderServiceApplication {


    public static void main(String[] args) {

        SpringApplication.run(OrderServiceApplication.class,args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return applicationArguments -> {
            System.out.println("order-server启动成功！");
        };
    }
}
