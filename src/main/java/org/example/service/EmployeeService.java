package org.example.service;

import org.example.dao.EmployeeRepository;
import org.example.entity.Employee;
import org.example.pojo.EmployeeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee insertData(EmployeeRequest employeeRequest)
    {
        return employeeRepository.save(new Employee(employeeRequest.getName(), employeeRequest.getRole()));
    }

    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }
}
