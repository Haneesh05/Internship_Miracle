package com.example.internJPA.Resources;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class JPAController {

	@Autowired
	private JPAService js;

//insert data into DB using JPA 

	@PostMapping("/insert")
	public Employee insert(@RequestBody Employee e) {
		return js.insertData(e);
	}

	@GetMapping("/retrieve")
	public List<Employee> getData() {
		return js.getData();
	}

	// get data of an ID from DB using JPA
	@GetMapping("/retrieveById/{id}")
	public Optional<Employee> getDataById(@PathVariable("id") long id) {
		return js.getDataById(id);

	}

	@GetMapping("/retrieveByName/{id}")
	public String getDataByName(@PathVariable("id") long id) {
		return js.getDataByName(id);

	}

}
