package com.em.departmentservice.dto;


import jakarta.validation.constraints.NotBlank;

public class DepartmentRequestDTO {

    @NotBlank(message = "Department Name Required.")
    private String departmentName;

    private String departmentDescription;

    @NotBlank(message = "Department Code Required.")
    private String departmentCode;
}
