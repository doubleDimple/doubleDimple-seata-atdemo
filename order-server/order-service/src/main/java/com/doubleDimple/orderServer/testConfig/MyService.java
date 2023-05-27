package com.doubleDimple.orderServer.testConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    @Autowired
    private ServiceProperties serviceTestProperties;


    public void doSomething() {
        String url = serviceTestProperties.getUrl();
        String username = serviceTestProperties.getName();
        // 使用数据库配置执行操作
        System.out.println("url是"+url);
        System.out.println("username是"+username);
    }
}
