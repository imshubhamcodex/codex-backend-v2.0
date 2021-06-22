package com.cts.providerRegistration.exceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class organizationNotFoundException extends Exception {
	Logger logger = LoggerFactory.getLogger(organizationNotFoundException.class);

	public organizationNotFoundException(String message) {
		super(message);
		logger.error("--- [    organizationNotFoundException] method invoked in exception handler ---");
	}
}
