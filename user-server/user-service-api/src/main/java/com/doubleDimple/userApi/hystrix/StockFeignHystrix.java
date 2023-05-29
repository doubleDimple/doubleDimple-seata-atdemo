package com.doubleDimple.userApi.hystrix;

import com.doubleDimple.userApi.service.UserFeignApi;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StockFeignHystrix implements FallbackFactory<UserFeignApi> {


    @Override
    public UserFeignApi create(Throwable throwable) {
        return null;
    }
}
