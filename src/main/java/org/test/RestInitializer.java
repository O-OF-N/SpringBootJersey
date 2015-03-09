package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class RestInitializer extends SpringBootServletInitializer {
	public static void main(String[] args) {
		System.out.println("1111111111");
		SpringApplication.run(RestInitializer.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		System.out.println(">>>>>>>>>Do I ever get here?");
		return application.sources(RestInitializer.class);
	}	
}
