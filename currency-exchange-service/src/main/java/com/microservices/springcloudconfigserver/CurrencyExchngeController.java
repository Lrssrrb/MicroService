package com.microservices.springcloudconfigserver;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchngeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		String env = environment.getProperty("local.server.port");
		CurrencyExchange currency = new CurrencyExchange(1000l, from, to, BigDecimal.valueOf(50),env);
		return currency;
	}
}
