package com.aretinsky.lenger.service;

import com.aretinsky.lenger.exception.ValidationException;
import com.aretinsky.lenger.dto.TasksDto;

import java.util.List;


public interface TasksService {
    TasksDto saveTask(TasksDto tasksDto) throws ValidationException;

    void deleteTask(Integer userId);

    List<TasksDto> findAllTasks();
}

