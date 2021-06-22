package com.cts.providerRegistration.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class providerNotFoundException extends Exception {
	Logger logger = LoggerFactory.getLogger(providerNotFoundException.class);
	public providerNotFoundException(String message) {
		super(message);
		logger.error("--- [    providerNotFoundException] method invoked in exception handler ---");
	}
}
