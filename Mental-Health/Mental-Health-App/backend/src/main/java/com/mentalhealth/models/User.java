package com.mentalhealth.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//This class represents a user in the system
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;  // Will be encoded
}
