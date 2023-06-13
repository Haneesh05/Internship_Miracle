package com.example.internJPA.Resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface JPARepo extends JpaRepository<Employee, Long> {

	
	@Query("select e.username from Employee e  where e.id = ?1")
	String getByUsername(long id);
	
	@Query("select e.phonenumber from Employee e  where e.id = ?1")
	String getByPhonenumber(long id);
	
	@Query("select e.emailId from Employee e  where e.id = ?1")
	String getByemailId(long id);
	
}
