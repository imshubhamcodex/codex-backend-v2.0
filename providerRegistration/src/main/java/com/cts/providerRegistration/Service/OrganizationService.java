package com.cts.providerRegistration.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.ProviderRegistrationApplication;
import com.cts.providerRegistration.Modal.Organization;
import com.cts.providerRegistration.Repository.OrganizationRepository;
import com.cts.providerRegistration.exceptionHandler.organizationNotFoundException;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;

import java.util.List;

@Service
public class OrganizationService {
	
	Logger logger = LoggerFactory.getLogger(OrganizationService.class);

	@Autowired
	private OrganizationRepository organizationRepository;

	public List<Organization> getAllOrganization() throws organizationNotFoundException {
		logger.warn("--- [    getAllOrganizations] method invoked in services ---");
		
		if (organizationRepository.findAll().size() == 0) {
			throw new organizationNotFoundException("Organization not found");
		} else {
			logger.warn("--- [    getAllOrganizations] method accessing repository ---");
			return organizationRepository.findAll();
		}

	}

	public String setOrganization(Organization organization) throws notNullExceptions {
		logger.warn("--- [    setOrganization] method invoked in services ---");
		
		if (organization.getOrganization_id() == 0 || organization.getOrganization_name() == ""
				|| organization.getOrganization_location() == "") {
			throw new notNullExceptions("All fields are mendatory");
		} else {
			logger.warn("--- [    setOrganization] method accessing repository ---");
			organizationRepository.save(organization);
			return "Organization Saved";
		}

	}
}
