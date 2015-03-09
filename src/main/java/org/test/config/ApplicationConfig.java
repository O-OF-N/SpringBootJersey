package org.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="application")
public class ApplicationConfig {

	private String name;
	private String age;
	public String getName() {
		System.out.println("Trying to get the name" + name);
		return name;
	}
	public void setName(String name) {
		System.out.println("Name is set as ="+name);
		this.name = name;
	}	
	public String getAge() {
		System.out.println("Trying to get the age" + age);
		return age;
	}
	public void setAge(String age) {
		System.out.println("Age is set as ="+age);
		this.age = age;
	}
	
	
}
