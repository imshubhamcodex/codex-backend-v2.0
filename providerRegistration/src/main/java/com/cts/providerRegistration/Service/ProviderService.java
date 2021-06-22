package com.cts.providerRegistration.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Provider;
import com.cts.providerRegistration.Repository.ProviderRepository;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;
import com.cts.providerRegistration.exceptionHandler.providerNotFoundException;

@Service
public class ProviderService {

	Logger logger = LoggerFactory.getLogger(ProviderService.class);

	@Autowired
	private ProviderRepository providerRepository;

	public List<Provider> getAllProvider() throws providerNotFoundException {
		logger.warn("--- [    getAllProvider] method invoked in services ---");

		if (providerRepository.findAll().size() == 0) {
			throw new providerNotFoundException("Provider not found");
		} else {
			logger.warn("--- [    getAllProvider] method accessing repository ---");
			return providerRepository.findAll();
		}
	}

	public String setProvider(Provider provider) throws notNullExceptions {
		logger.warn("--- [    setProvider] method invoked in services ---");
		
		if (provider.getProvider_id() == 0 || provider.getProvider_name() == "" || provider.getEmail_id() == ""
				|| provider.getPhone_number() == "" || provider.getGender() == '\u0000'
				|| provider.getOrganization_id() == 0) {
			throw new notNullExceptions("All fields are mendatory");
		} else {
			logger.warn("--- [    setProvider] method accessing repository ---");
			providerRepository.save(provider);
			return "Provider Saved";
		}
	}
}
