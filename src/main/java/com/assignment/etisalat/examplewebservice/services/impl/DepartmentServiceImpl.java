package com.assignment.etisalat.examplewebservice.services.impl;

import com.assignment.etisalat.examplewebservice.model.Department;
import com.assignment.etisalat.examplewebservice.model.Employee;
import com.assignment.etisalat.examplewebservice.repository.DepartmentRepository;
import com.assignment.etisalat.examplewebservice.services.DepartmentService;
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
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public List<Department> readAllDepartments(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Department> page=departmentRepository.findAll(pageable);
        if(page.hasContent()) {
            return page.getContent();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public Optional<Department> readDepartmentById(long employeeId) {
        return Optional.empty();
    }

    @Override
    public Department updateDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department createDepartmentRecord(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartmentById(long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
