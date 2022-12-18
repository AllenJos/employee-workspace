package com.dailycodebuffer.employeemanagementsystem.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    private String firstName;
    private String lastName;
    private String emailId;
}
