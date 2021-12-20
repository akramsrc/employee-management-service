package com.assignment.etisalat.examplewebservice.controller;

import com.assignment.etisalat.examplewebservice.model.Employee;
import com.assignment.etisalat.examplewebservice.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "EmployeeController", description = "EmployeeController providing CRUD operations")
@RestController
@RequestMapping("/v2/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("create")
    @Operation(method = "createEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
       return  employeeService.createEmployeeRecord(employee);
    }


    @GetMapping("read")
    @Operation(method = "readEmployee")
    public Employee readEmployee(@RequestParam Long employeeId){
       return employeeService.readEmployeeById(employeeId).get();
    }

    @PutMapping("update")
    @Operation(method = "updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete")
    @Operation(method = "deleteEmployee")
    public void deleteEmployee(@RequestParam Long employeeId){
        employeeService.deleteEmployeeById(employeeId);
    }

    @GetMapping("list")
    @Operation(method = "getEmployees")
    public List<Employee> getEmployees(@RequestParam(defaultValue = "0") Integer pageNo,
                                @RequestParam(defaultValue = "10") Integer pageSize){
        return employeeService.readAllEmployees(pageNo,pageSize);
    }
}
