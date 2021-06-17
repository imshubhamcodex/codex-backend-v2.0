package com.cts.providerRegistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Organization;
import com.cts.providerRegistration.Repository.OrganizationRepository;
import com.cts.providerRegistration.exceptionHandler.organizationNotFoundException;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;

import java.util.List;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;

	public List<Organization> getAllOrganization() throws organizationNotFoundException {
		if (organizationRepository.findAll().size() == 0) {
			throw new organizationNotFoundException("Organization not found");
		} else {
			return organizationRepository.findAll();
		}

	}

	public String setOrganization(Organization organization) throws notNullExceptions {
		if (organization.getOrganization_id() == 0 || organization.getOrganization_name() == ""
				|| organization.getOrganization_location() == "") {
			throw new notNullExceptions("All fields are mendatory");
		} else {
			organizationRepository.save(organization);
			return "Organization Saved";
		}

	}
}
