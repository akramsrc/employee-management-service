package com.assignment.etisalat.examplewebservice.model;

import lombok.*;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="employee_id", length = 6)
    private long employeeId;
    @Size(min = 3, max=20)
    @Column(name="first_name")
    @NotNull
    private String firstName;
    @Size(min = 3, max=25)
    @Column(name="last_name")
    @NotNull
    private String lastName;
    @Column(name="email", length = 25)
    private String email;
    @Pattern(regexp = "^\\+(?:[0-9]●?){6,14}[0-9]$")
    @Column(name="phone_number", length = 20)
    private String phoneNumber;
    @Column(name="hire_date")
    private Date hireDate;
    @Column(name="salary")
    @Range(min = 1)
    private Long salary;
    @Column(name="manager_id", length = 6)
    private long managerId;
    @Column(name="department_id", length = 4)
    private long departmentId;


    public Employee(long employeeId) {
        this.employeeId = employeeId;
    }


}
