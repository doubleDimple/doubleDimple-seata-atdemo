package com.doubleDimple.stockApi.hystrix;

import com.doubleDimple.stockApi.service.StockFeignApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import stock.entity.pojo.Inventory;

@Component
@Slf4j
public class StockFeignHystrix implements FallbackFactory<StockFeignApi> {


    @Override
    public StockFeignApi create(Throwable throwable) {
        return new StockFeignApi() {
            @Override
            public ResponseEntity update(Inventory inventory) {

                log.info("服务降级 [{}]", throwable);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        };
    }
}
