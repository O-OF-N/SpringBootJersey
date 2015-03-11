package org.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

@SpringBootApplication
public class RestInitializer {
	public static void main(String[] args) {
		System.out.println("REST INITIALIZER");
		SpringApplication.run(RestInitializer.class, args);
	}
	
	@Profile(value="dev")
	@Bean
	public EmbeddedDatabase devDataBase(){
		EmbeddedDatabase e = new EmbeddedDatabaseBuilder().setName("something").build();
		return e;
	}
}
