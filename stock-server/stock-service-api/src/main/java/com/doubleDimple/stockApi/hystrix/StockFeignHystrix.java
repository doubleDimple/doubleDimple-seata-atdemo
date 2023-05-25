package com.doubleDimple.stockApi.hystrix;

import com.doubleDimple.stockApi.service.StockFeignApi;
import feign.hystrix.FallbackFactory;
import stock.entity.pojo.Inventory;

public class StockFeignHystrix implements FallbackFactory<StockFeignApi> {

    @Override
    public StockFeignApi create(Throwable throwable) {
        return new StockFeignApi() {
            @Override
            public String update(Inventory inventory) {
                return "回滚了";
            }

            @Override
            public String add(Inventory inventory) {
                return null;
            }
        };
    }
}
