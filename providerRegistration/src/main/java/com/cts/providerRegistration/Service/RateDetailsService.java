package com.cts.providerRegistration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.RateDetails;
import com.cts.providerRegistration.Repository.RateDetailsRepository;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;
import com.cts.providerRegistration.exceptionHandler.rateNotFoundException;

@Service
public class RateDetailsService {

	@Autowired
	private RateDetailsRepository rateDetailsRepository;

	public List<RateDetails> getAllRateDetail() throws rateNotFoundException {
		if (rateDetailsRepository.findAll().size() == 0) {
			throw new rateNotFoundException("Rate Details Not Found");
		} else {
			return rateDetailsRepository.findAll();
		}
	}

	public String setRateDetails(RateDetails rateDetails) throws notNullExceptions {
//		if (rateDetails.getOrganization_id() == 0 || rateDetails.getService_id() == 0
//				|| rateDetails.getRate() < 0 || rateDetails.getDiscounted_rate() < 0) {
//			throw new notNullExceptions("All fields are mendatory");
//		} else {
//			rateDetailsRepository.save(rateDetails);
//			return "RateDetails Saved";
//		}
		
		rateDetailsRepository.save(rateDetails);
		return "RateDetails Saved";
		
	}
}
