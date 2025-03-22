package com.project.GraphQL.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrivate;

    @Column(unique = true, nullable = false)
    private UUID idPublic;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 300, unique = true)
    private String email;

    @Column(length = 300, nullable = false)
    private String password;


}
