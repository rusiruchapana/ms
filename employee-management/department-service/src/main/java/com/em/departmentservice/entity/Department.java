package com.em.departmentservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String departmentName;

    private String departmentDescription;

    @Column(nullable = false, unique = true)
    private String departmentCode;
}
