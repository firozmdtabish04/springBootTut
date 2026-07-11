package com.application.controller.DI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.DI.Car;
import com.application.service.DI.CarCrudService;

@RestController
@RequestMapping("/cars")
public class CarCrudController {

	@Autowired
	private CarCrudService carCrudService;

	// CREATE
	@PostMapping
	public Car save(@RequestBody Car car) {
		return carCrudService.save(car);
	}

	// READ ALL
	@GetMapping
	public List<Car> getAllCars() {
		return carCrudService.getAllCars();
	}

	// READ BY ID
	@GetMapping("/{id}")
	public Car getCar(@PathVariable int id) {
		return carCrudService.getCarById(id);
	}

	// UPDATE
	@PutMapping("/{id}")
	public Car update(@PathVariable int id, @RequestBody Car car) {
		return carCrudService.updateCar(id, car);
	}

	// DELETE
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return carCrudService.deleteCar(id);
	}
}