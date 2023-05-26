package com.doubleDimple.stockApi.hystrix;

import com.doubleDimple.stockApi.service.StockFeignApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import stock.entity.pojo.Inventory;

@Component
@Slf4j
public class StockFeignHystrix implements FallbackFactory<StockFeignApi> {


    @Override
    public StockFeignApi create(Throwable throwable) {
        return new StockFeignApi() {
            @Override
            public void update(Inventory inventory) {

                log.info("服务降级 [{}]", throwable);
            }

            @Override
            public void add(Inventory inventory) {

                log.info("服务降级 {}", throwable);
            }
        };
    }
}
