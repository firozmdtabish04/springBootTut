package com.application.service.DI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.entity.DI.Car;
import com.application.repository.DI.CarRepository;

@Service
public class CarCrudService {

	@Autowired
	private CarRepository repository;

	public Car save(Car car) {
		return repository.save(car);
	}

	public List<Car> getAllCars() {
		return repository.findAll();
	}

	public Car getCarById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Car updateCar(int id, Car car) {

		Car existing = repository.findById(id).orElse(null);

		if (existing != null) {
			existing.setName(car.getName());
			existing.setColor(car.getColor());

			return repository.save(existing);
		}

		return null;
	}

	public String deleteCar(int id) {
		repository.deleteById(id);
		return "Car Deleted Successfully";
	}
}