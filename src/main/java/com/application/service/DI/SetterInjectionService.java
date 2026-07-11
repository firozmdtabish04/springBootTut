package com.application.service.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectionService {
	private Engine engine;

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String drive() {
		return "Setter Injection\n" + engine.start();
	}
}
