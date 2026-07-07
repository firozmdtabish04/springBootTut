package com.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI healthcareOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Spring Boot Learning API")
						.description("REST APIs for Spring Boot Learning Project").version("1.0.0")
						.contact(new Contact().name("Tabish Firoz").email("mdtabishfiroz04@gmail.com"))
						.license(new License().name("Apache 2.0")))
				.externalDocs(new ExternalDocumentation().description("Project Documentation"));
	}
}