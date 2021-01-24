package com.java1995.lenger.service;

import com.java1995.lenger.dto.TasksDto;
import com.java1995.lenger.entity.Tasks;
import org.springframework.stereotype.Component;

@Component
public class TasksConverter {

    public Tasks fromTaskDtoToTask(TasksDto tasksDto) {
        Tasks tasks = new Tasks();
        tasks.setId(tasksDto.getId());
        tasks.setAuthor(tasksDto.getAuthor());
        tasks.setTask(tasksDto.getTask());
        tasks.setSolution(tasksDto.getSolution());
        tasks.setSuccess_count(tasksDto.getSuccess_count());
        tasks.setAttempts(tasksDto.getAttempts());
        tasks.setDifficult(tasksDto.getDifficult());
        return tasks;
    }

    public TasksDto fromTaskToTaskDto(Tasks tasks) {
        return TasksDto.builder()
                .id(tasks.getId())
                .author(tasks.getAuthor())
                .task(tasks.getTask())
                .solution(tasks.getSolution())
                .success_count(tasks.getSuccess_count())
                .attempts(tasks.getAttempts())
                .difficult(tasks.getAttempts())
                .build();
    }
}
