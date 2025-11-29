package com.example.demo;
import jakarta.persistence.*;

// prompt: Give me entity class EmployeeEntity for this 
// <output of desc employees>

@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String department;
    private Integer salary;

    // Constructors
    public EmployeeEntity() {}

    public EmployeeEntity(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters & Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public Integer getSalary() { return salary; }
    public void setSalary(Integer salary) { this.salary = salary; }
}
