package com.doubleDimple.userServer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider {

    private static ApplicationContext applicationContext;

    @Autowired
    public void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}

