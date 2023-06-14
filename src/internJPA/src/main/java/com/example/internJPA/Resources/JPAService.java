package com.example.internjpa.jpa;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//annotation for service class
@Service
public class JPAService {

    @Autowired
    JPARepo js;

//this method inserts data into DB 
    public Employee insertData(Employee e) {
        return js.save(e);
    }

//this method brings all the data from DB of emp table
    public List<Employee> getData() {
        return js.findAll();
    }
//this method brings the data of employee from DB from a particular ID
    public Optional<Employee> getDataById(long id) {
        return js.findById(id);
    }

//this method brings the Username from DB of a particular ID	
    public String getNameById(long id) {
        return js.getUsername(id);
    }

//this method brings the Phone number from DB of a particular ID
    public String getPhoneNumberById(long id) {
        return js.getUsername(id);
    }

//this method brings the email id from DB of a particular ID	
    public String getEmailIdById(long id) {  
        return js.getEmailId(id);
    }
}
