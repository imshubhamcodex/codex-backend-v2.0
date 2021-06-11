package com.cts.providerRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.providerRegistration.Modal.Provider;

public interface ProviderRepository extends JpaRepository<Provider,Integer> {
    
}
