package com.ll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LlApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LlApplication.class, args);
	}

	@Override
	protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(LlApplication.class);
	}

}
