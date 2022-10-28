package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.bean.Limits;
import com.microservices.limitsservice.configration.Configration;

@RestController
public class LimitsController {

	@Autowired
	private Configration configration;
	
	@GetMapping("/limits")
	public Limits retrivelLimits() {
		return new Limits(configration.getMinimum(),configration.getMaximum());
	}
}
