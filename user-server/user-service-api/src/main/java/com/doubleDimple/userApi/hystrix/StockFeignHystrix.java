package com.doubleDimple.userApi.hystrix;

import com.doubleDimple.userApi.service.UserFeignApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import stock.entity.pojo.Inventory;

@Component
@Slf4j
public class StockFeignHystrix implements FallbackFactory<UserFeignApi> {


    @Override
    public UserFeignApi create(Throwable throwable) {
        return new UserFeignApi() {
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
