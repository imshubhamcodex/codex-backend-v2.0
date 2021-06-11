package com.cts.providerRegistration.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.providerRegistration.Modal.Organization;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {
    
}
