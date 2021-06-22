package com.cts.providerRegistration.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.providerRegistration.ProviderRegistrationApplication;
import com.cts.providerRegistration.Modal.Organization;
import com.cts.providerRegistration.Service.OrganizationService;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;
import com.cts.providerRegistration.exceptionHandler.organizationNotFoundException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class OrganizationController {

	Logger logger = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	private OrganizationService organizationService;

	@GetMapping(value = "/")
	public String index() {
		return "Server is online";
	}

	@GetMapping(value = "/get-all-organization")
	public List<Organization> getAllOrganizations() throws organizationNotFoundException {
		logger.info("--- [    getAllOrganizations] method invoked in controller ---");
		return organizationService.getAllOrganization();
	}

	@PostMapping(value = "/set-organization")
	public String setOrganization(@RequestBody final Organization organization) throws notNullExceptions {
		logger.info("--- [    setOrganization] method invoked in controller ---");
		return organizationService.setOrganization(organization);
	}
}
