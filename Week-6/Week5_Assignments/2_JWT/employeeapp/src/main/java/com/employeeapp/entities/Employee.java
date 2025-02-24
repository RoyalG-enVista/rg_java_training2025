package com.employeeapp.entities;

import jakarta.persistence.*;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor @Getter  @Setter @EqualsAndHashCode
@Entity
@Table(name = "employee_table")
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int salary;

}
