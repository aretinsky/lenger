package org.aretinsky.lenger.service.interfaces;

import org.aretinsky.lenger.entity.user.Task;
import org.aretinsky.lenger.exception.ValidationException;
import org.aretinsky.lenger.dto.user.TaskDto;

import java.util.List;


public interface TaskService {
    TaskDto save(TaskDto taskDto) throws ValidationException;

    void deleteById(Integer userId);

    List<TaskDto> findAll();

    Task findById(int id);
}

