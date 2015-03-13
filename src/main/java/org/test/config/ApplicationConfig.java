package org.test.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="application")
public class ApplicationConfig {
	private static final Logger log = LoggerFactory.getLogger(ApplicationConfig.class);
	private String currentProfile;
	
	public String getCurrentProfile() {
		System.out.println("currentProfile = " + currentProfile);
		return currentProfile;
	}
	public void setCurrentProfile(String currentProfile) {
		System.out.println("currentProfile = " + currentProfile);
		this.currentProfile = currentProfile;
	}
	
	
	
}
