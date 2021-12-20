package com.assignment.etisalat.examplewebservice.services;

import com.assignment.etisalat.examplewebservice.model.Department;
import com.assignment.etisalat.examplewebservice.model.Employee;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    List<Department> readAllDepartments(int pageNo, int pageSize);
    Optional<Department> readDepartmentById(long employeeId);
    Department updateDepartment(Department department);
    Department createDepartmentRecord(Department department);
    void deleteDepartmentById(long departmentId);
}
