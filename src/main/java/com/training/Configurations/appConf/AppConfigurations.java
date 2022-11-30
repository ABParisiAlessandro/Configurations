package com.training.Configurations.appConf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigurations {
    @Value("${server.port}")
    private String serverPort;

    public String getServerPort() {
        return serverPort;
    }

    public String getIntegrationServicUrl() {
        return integrationServicUrl;
    }

    @Value("${integration.service.url}")
    private String integrationServicUrl;
}
