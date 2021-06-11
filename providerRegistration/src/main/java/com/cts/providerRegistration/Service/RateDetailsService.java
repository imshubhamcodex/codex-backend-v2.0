package com.cts.providerRegistration.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.RateDetails;
import com.cts.providerRegistration.Repository.RateDetailsRepository;

@Service
public class RateDetailsService {
    
    @Autowired
    private RateDetailsRepository rateDetailsRepository;
    
    public List<RateDetails> getAllRateDetail(){
        return rateDetailsRepository.findAll();
    }

    public String setRateDetails(RateDetails rateDetails){
        rateDetailsRepository.save(rateDetails);
        return "RateDetails Saved";
    }
}
