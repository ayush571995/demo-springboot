package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.pojo.EmployeeRequest;
import org.example.service.EmployeeService;
import org.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/insert")
    public Employee insertData(@RequestBody EmployeeRequest employee)
    {
        log.info(employee.toString());
        return employeeService.insertData(employee);
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return employeeService.findAll();
    }
}
