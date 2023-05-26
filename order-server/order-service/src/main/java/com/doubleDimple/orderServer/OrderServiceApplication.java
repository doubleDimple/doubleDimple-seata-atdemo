package com.doubleDimple.orderServer;

import com.doubleDimple.orderServer.feign.StockApi;
import com.doubleDimple.stockApi.service.StockFeignApi;
import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

//no fallbackFactory instance of type class com.doubleDimple.stockApi.hystrix.StockFeignHystrix found for feign client stock-server
//如果feign是以接口依赖的形式主入住的,当集成降级后,需要配置scanBasePackages
@SpringBootApplication
@MapperScan("com.doubleDimple.orderServer.mapper")
@EnableDiscoveryClient
@EnableFeignClients(clients = {StockApi.class})
public class OrderServiceApplication {


    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class,args);
    }
}
