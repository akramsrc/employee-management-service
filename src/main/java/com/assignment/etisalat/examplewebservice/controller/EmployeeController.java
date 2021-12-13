package com.assignment.etisalat.examplewebservice.controller;

import com.assignment.etisalat.examplewebservice.model.EmployeeResponse;
import com.assignment.etisalat.examplewebservice.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(name = "EmployeeController", description = "EmployeeController providing CRUD operations")
@RestController
@RequestMapping("/v2/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

   /* @PostMapping("create")
    @Operation(method = "createEmployee")
    public ResponseEntity<EmployeeResponse> createEmployee(){
        return null;
    }*/

    @GetMapping(path = "hello-world")
    @Operation(method = "helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

   /* @GetMapping("read")
    @Operation(method = "readEmployee")
    public ResponseEntity<EmployeeResponse> readEmployee(){
        return null;
    }

    @PutMapping("update")
    @Operation(method = "updateEmployee")
    public ResponseEntity<EmployeeResponse> updateEmployee(){
        return null;
    }

    @DeleteMapping("delete")
    @Operation(method = "deleteEmployee")
    public ResponseEntity<EmployeeResponse> deleteEmployee(){
        return null;
    }

    @GetMapping("list")
    @Operation(method = "getEmployees")
    public ResponseEntity<EmployeeResponse> getEmployees(){
        return null;
    }*/
}
