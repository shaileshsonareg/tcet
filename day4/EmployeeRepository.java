package com.example.demo;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    // Native SQL query to fetch all employees
    @Query(value = "SELECT * FROM employees", nativeQuery = true)
    List<EmployeeEntity> getAllEmployeesNative();

    // Native SQL query with parameter
    @Query(value = "SELECT * FROM employees WHERE department = :dept", nativeQuery = true)
    List<Employee> findByDepartmentNative(@Param("dept") String department);
}
