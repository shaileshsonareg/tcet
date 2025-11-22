package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    
    //on browser you need to hit this url http://localhost:8080/employee
    @RequestMapping(path="/employee", method = RequestMethod.GET)
    public String getEmployees() {
        return "I am from employee get";
    }

    @RequestMapping(path="/employee", method = RequestMethod.POST)
    public String postEmployees() {
        return "I am from employee post";
    }
}
