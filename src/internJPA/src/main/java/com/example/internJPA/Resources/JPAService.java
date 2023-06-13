package com.example.internJPA.Resources;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JPAService {

	@Autowired
	JPARepo jr;

	public Employee insertData(Employee e) {

		return jr.save(e);
	}

	public List<Employee> getData() {
		return jr.findAll();
	}

	public Optional<Employee> getDataById(long id) {
		return jr.findById(id);
	}

	public String getDataByName(long id) {
		return jr.getByUsername(id);
	}

}
