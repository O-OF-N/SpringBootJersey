package org.test.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		packages("org.test.controller");
	}
}
