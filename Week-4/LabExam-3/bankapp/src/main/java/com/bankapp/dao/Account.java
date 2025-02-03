package com.bankapp.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
@Entity
public class Account {

    @Autowired
    @Id
    private int id;
    private String name;
    private double balance;


}
