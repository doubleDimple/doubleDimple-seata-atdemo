package com.doubleDimple.orderServer.testConfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component("serviceTestProperties")
@ConfigurationProperties(prefix = "service.test")
public class ServiceProperties {

    private String name;

    private String url;
}
