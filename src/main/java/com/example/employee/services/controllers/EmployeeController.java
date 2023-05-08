package com.example.employee.services.controllers;

import com.example.employee.entities.Employee;
import com.example.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private  EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @PostMapping("/employees")
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }
    @PutMapping("/employees")
    public ResponseEntity updateEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.updateEmployee(employee));
    }
    @DeleteMapping("/employees")
    public ResponseEntity deleteEmployee(@RequestHeader Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/employeesbyid")
    public ResponseEntity getEmployeeByID(@RequestHeader Long id) {
        return ResponseEntity.ok(employeeService.getEmployeeByID(id));
    }
    @GetMapping("/employees/jobTitle")
    public ResponseEntity getEmployeeByJobTitle(@RequestHeader String jobTitle) {
        return ResponseEntity.ok(employeeService.getEmployeeByJobTitle(jobTitle));
    }
    @GetMapping("/employees/city")
    public ResponseEntity getEmployeeByCity(@RequestHeader String city) {
        return ResponseEntity.ok(employeeService.getEmployeeByCity(city));
    }
    @GetMapping("/employees/state")
    public ResponseEntity getEmployeeByState(@RequestHeader String state) {
        return ResponseEntity.ok(employeeService.getEmployeeByState(state));
    }
    @GetMapping("/employees/country")
    public ResponseEntity getEmployeeByCountry(@RequestHeader String country) {
        return ResponseEntity.ok(employeeService.getEmployeeByCountry(country));
    }
    @GetMapping("/employees/name")
    public ResponseEntity getEmployeeByName(@RequestHeader String name) {
        return ResponseEntity.ok(employeeService.getEmployeeByName(name));
    }
    @GetMapping("/employees/email")
    public ResponseEntity getEmployeeByEmail(@RequestHeader String email) {
        return ResponseEntity.ok(employeeService.getEmployeeByEmail(email));
    }
    @GetMapping("/employees/phone")
    public ResponseEntity getEmployeeByPhone(@RequestHeader String phone) {
        return ResponseEntity.ok(employeeService.getEmployeeByPhone(phone));
    }

}
