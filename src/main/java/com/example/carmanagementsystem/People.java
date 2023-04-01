package com.example.carmanagementsystem;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class People {

    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
}
