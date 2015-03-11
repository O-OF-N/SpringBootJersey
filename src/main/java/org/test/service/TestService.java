package org.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.dao.ITestDao;
import org.test.model.Someclass;

@Service
public class TestService implements ITestService{
	@Autowired
	private ITestDao testDao;
	
	public List<Someclass> getSomeClass(){
		System.out.println("Inside service");
		return testDao.findAll();
	}

	public void saveSomeClass(Someclass sc) {
		System.out.println(sc.getFirstName());
		System.out.println(sc.getLastName());
		testDao.save(sc);
	}

}
