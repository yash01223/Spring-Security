package com.spring.security.Spring_Security.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {


    private int id;
    private String username;
    private String password;
}
