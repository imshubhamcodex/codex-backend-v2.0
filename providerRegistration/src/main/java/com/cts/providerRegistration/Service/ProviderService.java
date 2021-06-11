package com.cts.providerRegistration.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.Provider;
import com.cts.providerRegistration.Repository.ProviderRepository;

@Service
public class ProviderService {
    
    @Autowired
    private ProviderRepository providerRepository ;

    public List<Provider> getAllProvider(){
        return providerRepository.findAll();
    }

    public String setProvider(Provider provider){
        providerRepository.save(provider);
        return "Provider Saved";
    }
}
