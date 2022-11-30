package com.training.Configurations;

import com.training.Configurations.appConf.AppConfigurations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class ConfigurationsApplication {
	private static Logger logger = (Logger) LoggerFactory.getLogger(ConfigurationsApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigurationsApplication.class, args);
		AppConfigurations appConfigurations = context.getBean(AppConfigurations.class);

		logger.info(appConfigurations.getServerPort());
		logger.info(appConfigurations.getIntegrationServicUrl());

		System.out.println("Ciao sono Nessuno e ho beccato il tuo occhio! Buahaha");
	}

}
