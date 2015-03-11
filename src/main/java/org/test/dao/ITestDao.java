package org.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.test.model.Someclass;

public interface ITestDao extends JpaRepository<Someclass, Integer>{

}
