package com.microservices.limitsservice.configration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties("limits-service")
public class Configration {

	private int minimum;
	private int maximum;
}
