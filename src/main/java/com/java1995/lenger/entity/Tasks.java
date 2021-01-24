package com.java1995.lenger.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Lombok generates getters and setters, equals and hash methods
@NoArgsConstructor
@Table(name = "task")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String author;

    private String task;

    private String solution;

    private int success_count;

    private int attempts;

    private double difficult;
}
