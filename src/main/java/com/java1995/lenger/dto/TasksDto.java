package com.java1995.lenger.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
public class TasksDto {
    private Integer id;

    private String author;

    private String task;

    private String solution;

    private int success_count;

    private int attempts;

    private double difficult;
}
