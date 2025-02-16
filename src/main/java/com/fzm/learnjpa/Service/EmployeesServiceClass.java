package com.fzm.learnjpa.Service;

import com.fzm.learnjpa.Entity.Employees;
import com.fzm.learnjpa.Repositry.EmployeesRepositoryClass;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceClass {

    private final EmployeesRepositoryClass repository;

    public EmployeesServiceClass(EmployeesRepositoryClass repository) {
        this.repository = repository;
    }

    // Get all employees
    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Optional<Employees> getEmployeeById(Integer id) {
        return repository.findById(id);
    }
}
