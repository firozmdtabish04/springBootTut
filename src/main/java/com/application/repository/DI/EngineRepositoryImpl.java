package com.application.repository.DI;

import org.springframework.stereotype.Repository;

@Repository
public class EngineRepositoryImpl implements EngineRepository {
	@Override
	public String startEngine() {
		return "Engine Started Successfully!";
	}
}
