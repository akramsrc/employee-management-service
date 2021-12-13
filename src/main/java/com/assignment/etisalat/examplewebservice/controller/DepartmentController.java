package com.assignment.etisalat.examplewebservice.controller;

import com.assignment.etisalat.examplewebservice.model.DepartmentResponse;
import com.assignment.etisalat.examplewebservice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/Department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
/*
    @PostMapping("create")
    public ResponseEntity<DepartmentResponse> createDepartment(){
        return null;
    }

    @GetMapping("read")
    public ResponseEntity<DepartmentResponse> readDepartment(){
        return null;
    }

    @PutMapping("update")
    public ResponseEntity<DepartmentResponse> updateDepartment(){
        return null;
    }

    @DeleteMapping("delete")
    public ResponseEntity<DepartmentResponse> deleteDepartment(){
        return null;
    }

    @GetMapping("list")
    public ResponseEntity<DepartmentResponse> getDepartments(){
        return null;
    }*/
}
