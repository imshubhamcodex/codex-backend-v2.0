package com.cts.providerRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.providerRegistration.Modal.Services;

public interface ServiceRepository extends JpaRepository<Services,Integer> {
    
}
