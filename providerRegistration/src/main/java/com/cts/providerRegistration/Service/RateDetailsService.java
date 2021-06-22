package com.cts.providerRegistration.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.providerRegistration.Modal.RateDetails;
import com.cts.providerRegistration.Repository.RateDetailsRepository;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;
import com.cts.providerRegistration.exceptionHandler.rateNotFoundException;

@Service
public class RateDetailsService {
	
	Logger logger = LoggerFactory.getLogger(RateDetailsService.class);

	@Autowired
	private RateDetailsRepository rateDetailsRepository;

	public List<RateDetails> getAllRateDetail() throws rateNotFoundException {
		logger.warn("--- [    getAllRateDetail] method invoked in services ---");
		
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
		
		logger.warn("--- [    setRateDetails] method invoked in services ---");
		
		logger.warn("--- [    setRateDetails] method accessing repository ---");
		
		rateDetailsRepository.save(rateDetails);
		return "RateDetails Saved";
		
	}
}
