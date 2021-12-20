package com.assignment.etisalat.examplewebservice.controller;

import com.assignment.etisalat.examplewebservice.model.Department;
import com.assignment.etisalat.examplewebservice.services.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/v2/Department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("create")
    @Operation(method = "createDepartment")
    public Department createDepartment(@RequestBody Department department){
        return departmentService.createDepartmentRecord(department);
    }


    @GetMapping("read")
    @Operation(method = "readDepartment")
    public Department readDepartment(@RequestParam Long departmentId){
        return departmentService.readDepartmentById(departmentId).get();
    }

    @PutMapping("update")
    @Operation(method = "updateDepartment")
    public Department updateDepartment(@NotNull @RequestBody() Department department){
       return departmentService.updateDepartment(department);
    }

    @DeleteMapping("delete")
    @Operation(method = "deleteDepartment")
    public void deleteDepartment(@RequestParam Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
    }

    @GetMapping("list")
    @Operation(method = "getDepartments")
    public List<Department> getDepartments(@RequestParam(defaultValue = "0") Integer pageNo,
                                                       @RequestParam(defaultValue = "10") Integer pageSize){
        return departmentService.readAllDepartments(pageNo,pageSize);
    }
}
