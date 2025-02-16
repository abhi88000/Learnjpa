package com.fzm.learnjpa.Controller;

import com.fzm.learnjpa.Entity.Employees;
import com.fzm.learnjpa.Service.EmployeesServiceClass;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControllerClass {

    private final EmployeesServiceClass service;

    public EmployeesControllerClass(EmployeesServiceClass service) {
        this.service = service;
    }

    // Get all employees
    @GetMapping("/getAll")
    public List<Employees> getAllEmployees() {
        return service.getAllEmployees();
    }
}
