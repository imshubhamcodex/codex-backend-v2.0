package com.cts.providerRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Services;
import com.cts.providerRegistration.Repository.ServiceRepository;
import com.cts.providerRegistration.exceptionHandler.serviceNotFoundException;

@Service
public class ServicesService {

	@Autowired
	private ServiceRepository serviceRepository;

	public List<Services> getAllService() throws serviceNotFoundException {
		if (serviceRepository.findAll().size() == 0) {
			throw new serviceNotFoundException("Service Not FOund");
		} else {
			return serviceRepository.findAll();

		}
	}
}
