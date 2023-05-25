package com.doubleDimple.orderApi.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "order-server")
public interface OrderFeignApi {


}
