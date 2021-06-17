package com.cts.providerRegistration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.providerRegistration.Modal.Provider;
import com.cts.providerRegistration.Service.ProviderService;
import com.cts.providerRegistration.exceptionHandler.notNullExceptions;
import com.cts.providerRegistration.exceptionHandler.providerNotFoundException;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api-pod8")
public class ProviderController {

	@Autowired
    private ProviderService providerService;
	
	@GetMapping(value = "/get-all-provider")
    public List<Provider> getAllProviders() throws providerNotFoundException {
        return providerService.getAllProvider();
    }

	@PostMapping(value = "/set-provider")
    public String setProvider(@RequestBody final Provider provider) throws notNullExceptions {
        return providerService.setProvider(provider);
    }
}
