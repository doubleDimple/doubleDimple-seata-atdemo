package com.doubleDimple.stockApi.service;


import com.doubleDimple.stockApi.hystrix.StockFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stock.entity.pojo.Inventory;

@FeignClient(name = "stock-server")
public interface StockFeignApi {


    @PostMapping("/stock-server/inventory/update")
    void update(@RequestBody Inventory inventory);

    @PostMapping("/stock-server/inventory/add")
    void add(@RequestBody Inventory inventory);
}
