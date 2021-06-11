package com.cts.providerRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.providerRegistration.Modal.Organization;
import com.cts.providerRegistration.Service.OrganizationService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class OrganizationController {

	@Autowired
    private OrganizationService organizationService;
	
	@GetMapping(value = "/")
    public String index() {
        return "Server is online";
    }
	
	@GetMapping(value = "/get-all-organization")
    public List<Organization> getAllOrganizations() {
        return organizationService.getAllOrganization();
    }
	
	@PostMapping(value = "/set-organization")
    public String setOrganization(@RequestBody final Organization organization) {
        return organizationService.setOrganization(organization);
    }
}
