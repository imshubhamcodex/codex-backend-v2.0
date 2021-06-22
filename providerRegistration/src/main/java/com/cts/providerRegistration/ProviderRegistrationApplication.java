package com.cts.providerRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cts")
public class ProviderRegistrationApplication {
	
	static Logger logger = LoggerFactory.getLogger(ProviderRegistrationApplication.class);

	public static void main(String[] args) {		
		logger.info("--- [    main] method start ---");
		SpringApplication.run(ProviderRegistrationApplication.class, args);
		logger.info("--- [    main] method end ---");
	}

}
