package org.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@SpringBootApplication
@ComponentScan({"org.test", "org.gradle"})
public class RestInitializer {
	private static final Logger log = LoggerFactory
			.getLogger(RestInitializer.class);

	public static void main(String[] args) {
		log.trace("Initializing spring boot standalone");
		SpringApplication.run(RestInitializer.class, args);
	}
	
	@Profile(value="dev")
	@Bean
	public EmbeddedDatabase devDataBase(){
		log.trace("Initializing in memory db");
		EmbeddedDatabase e = new EmbeddedDatabaseBuilder().setName("something").build();
		return e;
	}
}
