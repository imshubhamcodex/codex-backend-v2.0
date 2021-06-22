package com.cts.providerRegistration.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class rateNotFoundException extends Exception {
	Logger logger = LoggerFactory.getLogger(rateNotFoundException.class);
	public rateNotFoundException(String message) {
		super(message);
		logger.error("--- [    rateNotFoundException] method invoked in exception handler ---");
	}
}
