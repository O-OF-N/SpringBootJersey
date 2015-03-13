package org.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.config.ApplicationConfig;
import org.test.model.Someclass;
import org.test.service.ITestService;

@RestController
@RequestMapping(value="/test")
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	@Autowired
	ITestService testService;
	@Autowired
	ApplicationConfig appConfig;

	@RequestMapping(value="/test1",method=RequestMethod.GET,produces="application/json")
	public List<Someclass> fetch(){
		log.trace("entering");
		List<Someclass> sc =  testService.getSomeClass();
		System.out.println("Sc = " + sc);
		return sc;
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.POST,consumes="application/json")
	public void save(@RequestBody Someclass sc){
		log.trace("entering");
		testService.saveSomeClass(sc);
	}

}
