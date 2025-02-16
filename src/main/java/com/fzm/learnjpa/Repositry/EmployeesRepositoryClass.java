package com.fzm.learnjpa.Repositry;

import com.fzm.learnjpa.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepositoryClass extends JpaRepository<Employees, Integer> {
    List<Employees> findAll();
}