package com.example.internjpa.jpa;

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
    private JPAService jc;

//insert data into DB using JPA
    @PostMapping("/insert")
    public Employee insert(@RequestBody Employee e) {
        return jc.insertData(e);
    }

//Get all data from the DB using JPA
    @GetMapping("/retrieve")
    public List<Employee> putData() {
        return jc.getData();
    }

//Get data of an ID from DB using JPA
    @GetMapping("/retrieveById/{id}")
    public Optional<Employee> putDataById(@PathVariable("id") long id) {
        return jc.getDataById(id);
    }

//Get Username of a ID from DB using JPA
    @GetMapping("/retrieveByName/{id}")
    public String putNameById(@PathVariable("id") long id) {
        return jc.getNameById(id);
    }

//Get Username of a ID from DB using JPA
    @GetMapping("/retrieveByName/{id}")
    public String putPhoneNumberById(@PathVariable("id") long id) {
        return jc.getPhoneNumberById(id);
    }

//Get Username of a ID from DB using JPA
    @GetMapping("/retrieveByName/{id}")
    public String putEmailIdById(@PathVariable("id") long id) {
        return jc.getEmailIdById(id);
    }
}
