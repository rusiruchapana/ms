package com.em.departmentservice.service;

import com.em.departmentservice.dto.DepartmentRequestDTO;
import com.em.departmentservice.dto.DepartmentResponseDTO;
import jakarta.validation.Valid;

public interface DepartmentService {

    DepartmentResponseDTO createDepartmentService(DepartmentRequestDTO departmentRequestDTO);
}
