package com.java1995.spring_crud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Lombok generates getters and setters, equals and hash methods
@NoArgsConstructor //Lombok generates constructor without arguments
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String email;
}
