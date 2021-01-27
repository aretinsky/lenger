package com.aretinsky.lenger.service;


import com.aretinsky.lenger.dto.TaskDto;
import com.aretinsky.lenger.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public Task fromTaskDtoToTask(TaskDto taskDto) {
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setTitle(taskDto.getTitle());
        task.setAuthor(taskDto.getAuthor());
        task.setTask(taskDto.getTask());
        task.setSolution(taskDto.getSolution());
        task.setSuccess_count(taskDto.getSuccess_count());
        task.setAttempts(taskDto.getAttempts());
        task.setDifficult(taskDto.getDifficult());
        return task;
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
