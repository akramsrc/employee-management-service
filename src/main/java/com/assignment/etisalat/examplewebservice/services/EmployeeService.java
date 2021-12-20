package com.assignment.etisalat.examplewebservice.services;


import com.assignment.etisalat.examplewebservice.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> readAllEmployees(int pageNo, int pageSize);
    Optional<Employee> readEmployeeById(long employeeId);
    Employee updateEmployee(Employee employee);
    Employee createEmployeeRecord(Employee employee);
    void deleteEmployeeById(long employeeId);
}
