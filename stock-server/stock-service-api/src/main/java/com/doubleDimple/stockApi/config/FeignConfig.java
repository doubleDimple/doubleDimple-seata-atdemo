package com.doubleDimple.stockApi.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLogerLevel(){

        return Logger.Level.FULL;
    }

    /**
     * 超时时间配置
     * @return
     */
    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }
}
