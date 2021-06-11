package com.cts.providerRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.providerRegistration.Modal.RateDetails;

public interface RateDetailsRepository extends JpaRepository<RateDetails,Integer> {
    
}