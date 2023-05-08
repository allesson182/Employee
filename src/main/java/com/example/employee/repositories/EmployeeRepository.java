package com.example.employee.repositories;

import com.example.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    List<Employee> findByCity(String city);

    List<Employee> findByCountry(String country);

    List<Employee> findByState(String state);

    List<Employee> findByJobTitle(String jobTitle);

    List<Employee> findByName(String name);

    List<Employee> findByEmail(String email);

    List<Employee> findByPhone(String phone);
}
