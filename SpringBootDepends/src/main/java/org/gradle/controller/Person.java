package org.gradle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/testmodule")
public class Person {
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public void fetch(){
		System.out.println("Some sorta test. Get lost now.");
	}
}
