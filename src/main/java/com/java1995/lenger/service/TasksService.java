package com.java1995.lenger.service;

import com.java1995.lenger.dto.TasksDto;
import com.java1995.lenger.exception.ValidationException;

import java.util.List;

public interface TasksService {
    TasksDto saveTask(TasksDto tasksDto) throws ValidationException;
    void deleteTask(Integer userId);
    List<TasksDto> findAllTasks();
}
