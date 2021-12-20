package com.assignment.etisalat.examplewebservice.services.impl;

import com.assignment.etisalat.examplewebservice.model.Employee;
import com.assignment.etisalat.examplewebservice.repository.EmployeeRepository;
import com.assignment.etisalat.examplewebservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> readAllEmployees(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Employee> page=employeeRepository.findAll(pageable);
        if(page.hasContent()) {
            return page.getContent();
        } else {
            return new ArrayList<>();
        }
    }

    public Optional<Employee> readEmployeeById(long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee createEmployeeRecord(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
