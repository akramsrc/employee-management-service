package com.assignment.etisalat.examplewebservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue
    @Column(name="department_id", length = 4)
    private long departmentId;
    @Column(name = "department_name", length = 30)
    private String departmentName;
    @Column(name="manager_id", length = 6)
    private long managerId;
}
