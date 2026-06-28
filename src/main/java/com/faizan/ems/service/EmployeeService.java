package com.faizan.ems.service;

import com.faizan.ems.dto.EmployeeDto;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto getEmployeeById(Long id);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);

    Page<EmployeeDto> getAllEmployees(Pageable pageable);

    List<EmployeeDto> getEmployeesByDepartment(String department);

    EmployeeDto getEmployeeByEmail(String email);
}