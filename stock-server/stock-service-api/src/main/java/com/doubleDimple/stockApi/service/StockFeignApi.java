package com.doubleDimple.stockApi.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stock.entity.pojo.Inventory;

@FeignClient(name = "stock-server",url = "http://192.168.31.143:7897/stock-server")
public interface StockFeignApi {


    @PostMapping("/inventory/update")
    String update(@RequestBody Inventory inventory);
}
