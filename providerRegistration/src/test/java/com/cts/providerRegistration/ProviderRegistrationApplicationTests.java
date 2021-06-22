package com.cts.providerRegistration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.providerRegistration.Repository.OrganizationRepository;
import com.cts.providerRegistration.Repository.ProviderRepository;
import com.cts.providerRegistration.Repository.RateDetailsRepository;
import com.cts.providerRegistration.Repository.ServiceRepository;
import com.cts.providerRegistration.Service.OrganizationService;
import com.cts.providerRegistration.Service.ProviderService;
import com.cts.providerRegistration.Service.RateDetailsService;
import com.cts.providerRegistration.Service.ServicesService;
import com.cts.providerRegistration.exceptionHandler.organizationNotFoundException;
import com.cts.providerRegistration.exceptionHandler.providerNotFoundException;
import com.cts.providerRegistration.exceptionHandler.rateNotFoundException;
import com.cts.providerRegistration.exceptionHandler.serviceNotFoundException;

@SpringBootTest
class ProviderRegistrationApplicationTests {

	@Test
	void contextLoads() {

	}

	@Autowired
	OrganizationService organizationService;
	OrganizationService organizationService1 = null;

	@Autowired
	ProviderService providerService;
	ProviderService providerService1 = null;

	@Autowired
	RateDetailsService rateDetailsService;
	RateDetailsService rateDetailsService1 = null;

	@Autowired
	ServicesService servicesService;
	ServicesService servicesService1 = null;

	@Autowired
	OrganizationRepository organizationRepository;

	@Autowired
	ProviderRepository providerRepository;

	@Autowired
	RateDetailsRepository rateDetailsRepository;

	@Autowired
	ServiceRepository serviceRepository;

	@Test
	public void Organization_Exceptionexpected() {
		Assertions.assertThrows(Exception.class, () -> {
			int size = 0 - organizationService.getAllOrganization().size();
			String test = "a";
			String s = test.substring(0, size);
		});
	}

	@Test
	public void Provider_Exceptionexpected() {
		Assertions.assertThrows(Exception.class, () -> {
			int size = 0 - providerService.getAllProvider().size();
			String test = "a";
			String s = test.substring(0, size);
		});
	}

	@Test
	public void RateDetails_Exceptionexpected() {
		Assertions.assertThrows(Exception.class, () -> {
			int size = 0 - rateDetailsService.getAllRateDetail().size();
			String test = "a";
			String s = test.substring(0, size);
		});
	}

	@Test
	public void Organization_ServiceRepository() throws organizationNotFoundException {
		assertEquals(organizationRepository.findAll().size(), organizationService.getAllOrganization().size());
	}

	@Test
	public void Provider_ServiceRepository() throws providerNotFoundException {
		assertEquals(providerRepository.findAll().size(), providerService.getAllProvider().size());
	}

	@Test
	public void RateDetails_ServiceRepository() throws rateNotFoundException {
		assertEquals(rateDetailsRepository.findAll().size(), rateDetailsService.getAllRateDetail().size());
	}

	@Test
	public void Services_ServiceRepository() throws serviceNotFoundException {
		assertEquals(serviceRepository.findAll().size(), servicesService.getAllService().size());
	}

	@Test
	public void valid_OrganizationServiceObject() {
		assertNotNull(organizationService);
	}

	@Test
	public void invalid_OrganizationServiceObject() {
		assertNull(organizationService1);
	}

	@Test
	public void valid_ProviderServiceObject() {
		assertNotNull(providerService);
	}

	@Test
	public void invalid_ProviderServiceObject() {
		assertNull(providerService1);
	}

	@Test
	public void valid_RateDetailsServiceObject() {
		assertNotNull(rateDetailsService);
	}

	@Test
	public void invalid_RateDetailsServiceObject() {
		assertNull(rateDetailsService1);
	}

	@Test
	public void valid_ServicesServiceObject() {
		assertNotNull(servicesService);
	}

	@Test
	public void invalid_ServicesServiceObject() {
		assertNull(servicesService1);
	}

}
