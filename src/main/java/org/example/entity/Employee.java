package org.example.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@EqualsAndHashCode
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;


    public Employee(String name, String role)
    {
        this.name = name;
        this.role = role;
    }
}
