package com.cts.providerRegistration.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class serviceNotFoundException extends Exception {
	Logger logger = LoggerFactory.getLogger(serviceNotFoundException.class);
	public serviceNotFoundException(String message) {
		super(message);
		logger.error("--- [    serviceNotFoundException] method invoked in exception handler ---");
	}
}
