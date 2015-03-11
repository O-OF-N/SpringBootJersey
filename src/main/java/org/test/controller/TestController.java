package org.test.controller;

import java.util.List;

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
	@Autowired
	ITestService testService;
	@Autowired
	ApplicationConfig appConfig;

	@RequestMapping(value="/test1",method=RequestMethod.GET,produces="application/json")
	public List<Someclass> fetch(){
		System.out.println("Some where here man");
		System.out.println("Name = " + appConfig.getName());
		System.out.println("Age = " + appConfig.getAge());
		List<Someclass> sc =  testService.getSomeClass();
		System.out.println("Sc = " + sc);
		return sc;
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.POST,consumes="application/json")
	public void save(@RequestBody Someclass sc){
		System.out.println("Some where here man1111");
		System.out.println("Name1 = " + appConfig.getName());
		System.out.println("Age1 = " + appConfig.getAge());
		testService.saveSomeClass(sc);
	}

}
