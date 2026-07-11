package com.application.service.DI;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectionService {
	private final Engine engine;

	public ConstructorInjectionService(Engine engine) {
		this.engine = engine;
	}

	public String drive() {
		return "Construction Injection\n" + engine.start();
	}
}
