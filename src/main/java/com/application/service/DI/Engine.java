package com.application.service.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.repository.DI.EngineRepository;

@Service
public class Engine {
	@Autowired
	private EngineRepository engineRepository;

	public String start() {
		return engineRepository.startEngine();

	}
}
