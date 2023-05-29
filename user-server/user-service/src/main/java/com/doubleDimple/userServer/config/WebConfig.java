package com.doubleDimple.userServer.config;

import com.doubleDimple.userServer.interceptor.MyJwtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor())
                //拦截所有请求，通过判断token来决定是否需要登陆
                .addPathPatterns("/**")
                .excludePathPatterns("/login");
    }

    @Bean
    public MyJwtInterceptor jwtInterceptor(){
        return new MyJwtInterceptor();
    }
}
