package org.test.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.test.model.Someclass;
import org.test.service.ITestService;

@Controller
@Path("/test")
public class TestController {
	@Autowired
	ITestService testService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Someclass printMessage(){
		return testService.getSomeClass();
	}

}
