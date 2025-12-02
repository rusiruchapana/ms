package com.em.departmentservice.controller;

import com.em.departmentservice.dto.DepartmentRequestDTO;
import com.em.departmentservice.dto.DepartmentResponseDTO;
import com.em.departmentservice.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentResponseDTO> createDepartmentController(@Valid @RequestBody DepartmentRequestDTO departmentRequestDTO){
        DepartmentResponseDTO createdDepartment = departmentService.createDepartmentService(departmentRequestDTO);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }




}
