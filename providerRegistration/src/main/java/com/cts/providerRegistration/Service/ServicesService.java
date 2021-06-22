package com.cts.providerRegistration.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Services;
import com.cts.providerRegistration.Repository.ServiceRepository;
import com.cts.providerRegistration.exceptionHandler.serviceNotFoundException;

@Service
public class ServicesService {
	
	Logger logger = LoggerFactory.getLogger(ServicesService.class);

	@Autowired
	private ServiceRepository serviceRepository;

	public List<Services> getAllService() throws serviceNotFoundException {
		logger.warn("--- [    getAllService] method invoked in services ---");
		
		if (serviceRepository.findAll().size() == 0) {
			throw new serviceNotFoundException("Service Not FOund");
		} else {
			logger.warn("--- [    getAllService] method accessing repository ---");
			
			return serviceRepository.findAll();

		}
	}
}
