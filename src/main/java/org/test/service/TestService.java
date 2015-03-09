package org.test.service;

import org.springframework.stereotype.Service;
import org.test.model.Someclass;

@Service
public class TestService implements ITestService{
	
	public Someclass getSomeClass(){
		System.out.println("Inside service");
		return new Someclass();
	}

}
