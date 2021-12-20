package com.assignment.etisalat.examplewebservice.repository;

import com.assignment.etisalat.examplewebservice.model.Department;
import com.assignment.etisalat.examplewebservice.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {
}
