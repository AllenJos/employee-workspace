package com.dailycodebuffer.employeemanagementsystem.service;

import com.dailycodebuffer.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
