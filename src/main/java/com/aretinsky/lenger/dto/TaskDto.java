package com.aretinsky.lenger.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Integer id;

    private String title;

    private String author;

    private String task;

    private String solution;

    private int success_count;

    private int attempts;

    private double difficult;

}
