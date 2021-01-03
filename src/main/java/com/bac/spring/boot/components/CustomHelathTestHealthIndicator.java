package com.bac.spring.boot.components;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHelathTestHealthIndicator implements HealthIndicator {
	
	private Health health = Health.status("I <3 CustomHelathTestHealthIndicator").build();

	@Override
	public Health health() {
		return health;
	}

}
