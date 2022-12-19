package com.dailycodebuffer.employeemanagementsystem.entity;

import com.dailycodebuffer.employeemanagementsystem.model.Employee;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String emailId;


    public Employee to() {
        return Employee.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .emailId(this.emailId)
                .build();
    }
}
