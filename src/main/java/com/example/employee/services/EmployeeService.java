package com.example.employee.services;

import com.example.employee.entities.Employee;
import com.example.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee>getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeByID(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        if (employee.getName() != null) {
            existingEmployee.setName(employee.getName());
        }
        if (employee.getEmail() != null) {
            existingEmployee.setEmail(employee.getEmail());
        }
        if (employee.getCity() != null) {
            existingEmployee.setCity(employee.getCity());
        }
        if (employee.getCountry() != null) {
            existingEmployee.setCountry(employee.getCountry());
        }
        if (employee.getPhone() != null) {
            existingEmployee.setPhone(employee.getPhone());
        }
        if (employee.getState() != null) {
            existingEmployee.setState(employee.getState());
        }
        if (employee.getJobTitle() != null) {
            existingEmployee.setJobTitle(employee.getJobTitle());
        }
        return employeeRepository.save(existingEmployee);
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public List<Employee> getEmployeeByCity(String city) {
        return employeeRepository.findByCity(city);
    }
    public List<Employee> getEmployeeByCountry(String country) {
        return employeeRepository.findByCountry(country);
    }
    public List<Employee> getEmployeeByState(String state) {
        return employeeRepository.findByState(state);
    }
    public List<Employee> getEmployeeByJobTitle(String jobTitle) {
        return employeeRepository.findByJobTitle(jobTitle);
    }
    public List<Employee> getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
    public List<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
    public List<Employee> getEmployeeByPhone(String phone) {
        return employeeRepository.findByPhone(phone);
    }



}
