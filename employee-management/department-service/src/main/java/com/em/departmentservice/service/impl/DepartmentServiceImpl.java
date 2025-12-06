package com.em.departmentservice.service.impl;

import com.em.departmentservice.dto.DepartmentRequestDTO;
import com.em.departmentservice.dto.DepartmentResponseDTO;
import com.em.departmentservice.entity.Department;
import com.em.departmentservice.mapper.DepartmentMapper;
import com.em.departmentservice.repository.DepartmentRepository;
import com.em.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private  DepartmentMapper departmentMapper;
    @Autowired
    private  DepartmentRepository departmentRepository;

    @Override
    public DepartmentResponseDTO createDepartmentService(DepartmentRequestDTO departmentRequestDTO) {
        Department convertedDto = departmentMapper.toEntity(departmentRequestDTO);
        Department createdDepartment = departmentRepository.save(convertedDto);

        DepartmentResponseDTO convertedEntity = departmentMapper.toDto(createdDepartment);
        return convertedEntity;
    }
}
