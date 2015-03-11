package org.test.service;

import java.util.List;

import org.test.model.Someclass;

public interface ITestService {
	
	public List<Someclass> getSomeClass();
	public void saveSomeClass(Someclass sc);

}
