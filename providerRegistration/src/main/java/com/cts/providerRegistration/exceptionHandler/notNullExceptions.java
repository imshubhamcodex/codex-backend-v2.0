package com.cts.providerRegistration.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cts.providerRegistration.Controller.ServicesController;

public class notNullExceptions extends Exception {
	
	Logger logger = LoggerFactory.getLogger(notNullExceptions.class);

	public notNullExceptions(String message) {
		super(message);
		logger.error("--- [    notNullExceptions] method invoked in exception handler ---");
	}
}
