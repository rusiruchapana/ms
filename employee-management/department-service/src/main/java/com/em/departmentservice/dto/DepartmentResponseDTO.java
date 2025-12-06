package com.em.departmentservice.dto;

import lombok.Data;

@Data
public class DepartmentResponseDTO {
    private int id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
