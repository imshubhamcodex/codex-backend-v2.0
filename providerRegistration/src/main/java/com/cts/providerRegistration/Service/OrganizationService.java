package com.cts.providerRegistration.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Organization;
import com.cts.providerRegistration.Repository.OrganizationRepository;

import java.util.List;



@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    
    public List<Organization> getAllOrganization(){
        return organizationRepository.findAll();
    }

    public String setOrganization(Organization organization){
        organizationRepository.save(organization);
        return "Organization Saved";
    }
}
