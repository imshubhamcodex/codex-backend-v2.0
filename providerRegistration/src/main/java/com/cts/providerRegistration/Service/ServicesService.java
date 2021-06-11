package com.cts.providerRegistration.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Services;
import com.cts.providerRegistration.Repository.ServiceRepository;

@Service
public class ServicesService {
    
    @Autowired
    private ServiceRepository serviceRepository;

    public List<Services> getAllService(){
        return serviceRepository.findAll();
    }
}
