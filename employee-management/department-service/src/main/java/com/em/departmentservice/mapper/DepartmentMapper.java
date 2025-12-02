package com.em.departmentservice.mapper;

import com.em.departmentservice.dto.DepartmentRequestDTO;
import com.em.departmentservice.dto.DepartmentResponseDTO;
import com.em.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DepartmentMapper {
    Department toEntity(DepartmentRequestDTO departmentRequestDTO);
    DepartmentResponseDTO toDto(Department department);
}
