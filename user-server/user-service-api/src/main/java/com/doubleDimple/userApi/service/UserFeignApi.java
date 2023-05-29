package com.doubleDimple.userApi.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-server")
public interface UserFeignApi {

}
