package com.fzm.learnjpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
public class Employees {

    @Id
    @Column(name = "employee_number")
    private Integer employee_number;

    @Column(name = "last_name", nullable = false)
    private String last_name;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "office_code")
    private String office_code;

    @Column(name = "reports_to")
    private Integer reports_to;

    @Column(name = "job_title")
    private String job_title;

    public Employees(Integer employeeNumber, String last_name, String first_name, String extension, String email, String office_code, Integer reports_to, String job_title) {
        this.employee_number = employeeNumber;
        this.last_name = last_name;
        this.first_name = first_name;
        this.extension = extension;
        this.email = email;
        this.office_code = office_code;
        this.reports_to = reports_to;
        this.job_title = job_title;
    }
}
