package com.aretinsky.lenger.service;

import com.aretinsky.lenger.entity.Task;
import com.aretinsky.lenger.exception.ValidationException;
import com.aretinsky.lenger.dto.TaskDto;

import java.util.List;


public interface TaskService {
    TaskDto saveTask(TaskDto taskDto) throws ValidationException;

    void deleteTask(Integer userId);

    List<TaskDto> findAllTasks();

    Task findTaskById(int id);
}

