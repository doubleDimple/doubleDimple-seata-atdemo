package com.doubleDimple.userApi.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stock.entity.pojo.Inventory;

@FeignClient(name = "user-server")
public interface UserFeignApi {

}
