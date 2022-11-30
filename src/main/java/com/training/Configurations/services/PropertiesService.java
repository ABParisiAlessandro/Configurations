package com.training.Configurations.services;

import com.training.Configurations.appConf.AppConfigurations;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {
    AppConfigurations appConfigurations;

    public PropertiesService(AppConfigurations appConfigurations){
        this.appConfigurations = appConfigurations;
    }
    public String getProperties() {
        return appConfigurations.getIntegrationServicUrl();
    }
}
