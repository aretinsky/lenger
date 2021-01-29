package com.aretinsky.lenger.service;


import com.aretinsky.lenger.dto.TaskDto;
import com.aretinsky.lenger.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public Task fromTaskDtoToTask(TaskDto taskDto) {
        return Task.builder()
                .id(taskDto.getId())
                .title(taskDto.getTitle())
                .author(taskDto.getAuthor())
                .task(taskDto.getTask())
                .solution(taskDto.getSolution())
                .success_count(taskDto.getSuccess_count())
                .attempts(taskDto.getAttempts())
                .difficult(taskDto.getDifficult())
                .build();
    }

    public TaskDto fromTaskToTaskDto(Task task) {
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .author(task.getAuthor())
                .task(task.getTask())
                .solution(task.getSolution())
                .success_count(task.getSuccess_count())
                .attempts(task.getAttempts())
                .difficult(task.getDifficult())
                .build();
    }
}
