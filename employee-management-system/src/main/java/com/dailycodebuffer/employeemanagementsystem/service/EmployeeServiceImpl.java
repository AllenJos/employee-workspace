package com.dailycodebuffer.employeemanagementsystem.service;

import com.dailycodebuffer.employeemanagementsystem.entity.EmployeeEntity;
import com.dailycodebuffer.employeemanagementsystem.model.Employee;
import com.dailycodebuffer.employeemanagementsystem.respository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return null;
    }
}
