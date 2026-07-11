package com.application.controller.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.DI.CarService;
import com.application.service.DI.ConstructorInjectionService;
import com.application.service.DI.FieldInjectionService;
import com.application.service.DI.SetterInjectionService;

@RestController
@RequestMapping("/di")
public class CarController {
	@Autowired
	private CarService carService;

	@Autowired
	private FieldInjectionService fieldInjectionService;

	@Autowired
	private SetterInjectionService setterInjectionService;

	@Autowired
	private ConstructorInjectionService constructorInjectionService;

	@GetMapping("/get")
	public String driveCar() {
		return carService.drive();
	}

	@GetMapping("/field")
	public String fieldInjection() {
		return fieldInjectionService.drive();
	}

	@GetMapping("/setter")
	public String setterInjection() {
		return setterInjectionService.drive();
	}

	@GetMapping("/constructor")
	public String constructorInjection() {
		return constructorInjectionService.drive();
	}

}
