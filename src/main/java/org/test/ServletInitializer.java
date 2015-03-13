package org.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {
	private static final Logger log = LoggerFactory
			.getLogger(SpringBootServletInitializer.class);

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		log.trace("Initializing spring boot servlet container");
		return application.sources(ServletInitializer.class);
	}

}
