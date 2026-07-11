package com.application.service.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	private Engine engine;

	public String drive() {
		return engine.start() + "\nCar is Running";
	}
}
