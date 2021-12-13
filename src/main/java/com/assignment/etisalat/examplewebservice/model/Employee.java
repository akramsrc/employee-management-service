package com.assignment.etisalat.examplewebservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="employee_id", length = 6)
    private int employeeId;
    @Column(name="first_name", length = 20)
    private String firstName;
    @Column(name="last_name", length = 25)
    private String lastName;
    @Column(name="email", length = 25)
    private String email;
    @Column(name="phone_number", length = 20)
    private String phoneNumber;
    @Column(name="hire_date")
    private Date hireDate;
    @Column(name="salary")
    private Long salary;
    @Column(name="manager_id", length = 6)
    private int managerId;
    @Column(name="department_id", length = 4)
    private int departmentId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }



}
