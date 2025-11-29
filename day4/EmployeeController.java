package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class EmployeeController {
//Create Employee class (POJO) with id(int), name(String), department(String), salary(int)
//CW: Create endpoint /employee GET which will print list of employees
//Create collection List<Employee> emps = new ArrayList<>();
//CW: Create CRUD application for /employee GET POST PUT DELETE
// /employee POST {id:1, name: "newEmp", department: "HR", salary: 22000}
// /employee/1 PUT {salary: 25000}
// /employee/1 DELETE

    private final EmployeeRepository employeeRepository;

    List<Employee> emps;
    
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        emps = new ArrayList<>();
        emps.add(new Employee(1, "Amit", "IT", 24000));
        emps.add(new Employee(2, "Ramesh", "HR", 21000));
    }
    //Support Number: 9172007007
    
    @GetMapping("/employeedb")
    public List<EmployeeEntity> getDbEmployees() {
        return employeeRepository.getAllEmployeesNative();
    }








    @GetMapping("/employee")
    public List<Employee> getAllEmps() {
        return emps;
    }

    //{  "id": 4, "name": "Kiran", "department": "IT", "salary": 32000 }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee e) {
        emps.add(e);
        return e;
    }

    //http://localhost:8080/employee/2
    @PutMapping("/employee/{id}")
    public Employee editEmployee(@PathVariable String id, @RequestBody Employee e) {
        for(Employee tempe: emps) {
            if(tempe.id == Integer.parseInt(id)) {
                tempe.salary = e.salary;
            }
        }
        return e;
    }

    //http://localhost:8080/employee/2
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        emps.removeIf(e -> e.getId() == Integer.parseInt(id));
        return "Employee record delete successfully..";
    }
    
}
