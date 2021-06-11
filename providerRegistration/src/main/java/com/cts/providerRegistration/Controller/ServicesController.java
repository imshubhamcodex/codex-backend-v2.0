package com.cts.providerRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.providerRegistration.Modal.Services;
import com.cts.providerRegistration.Service.ServicesService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class ServicesController {
	
	@Autowired
    private ServicesService servicesService;
	
	@GetMapping(value = "/get-all-service")
    public List<Services> getAllServices() {
        return servicesService.getAllService();
    }
}
