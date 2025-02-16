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

    public List<Employees> getAllEmployees() {
        return repository.findAll();
    }

}
