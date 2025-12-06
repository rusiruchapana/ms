package com.em.departmentservice.mapper;

import com.em.departmentservice.dto.DepartmentRequestDTO;
import com.em.departmentservice.dto.DepartmentResponseDTO;
import com.em.departmentservice.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toEntity(DepartmentRequestDTO departmentRequestDTO);
    Department toEntity(DepartmentResponseDTO departmentResponseDTO);
    DepartmentResponseDTO toDto(Department department);
}
