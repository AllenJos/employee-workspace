package com.dailycodebuffer.employeemanagementsystem.respository;

import com.dailycodebuffer.employeemanagementsystem.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
