package com.application.service.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FieldInjectionService {
	@Autowired
	private Engine engine;

	public String drive() {
		return "Field Injection\n" + engine.start();
	}
}
