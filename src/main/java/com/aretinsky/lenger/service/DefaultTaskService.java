package com.aretinsky.lenger.service;

import com.aretinsky.lenger.exception.ValidationException;
import com.aretinsky.lenger.dto.TaskDto;
import com.aretinsky.lenger.entity.Task;
import com.aretinsky.lenger.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class DefaultTaskService implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskConverter taskConverter;

    /*private void validateTaskDto(TaskDto taskDto) throws ValidationException {
        if (isNull(taskDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(taskDto.getSolution()) || taskDto.getSolution().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }*/


    @Override
    public TaskDto saveTask(TaskDto taskDto) throws ValidationException {
        Task savedTask = taskRepository.save(taskConverter.fromTaskDtoToTask(taskDto));
        return taskConverter.fromTaskToTaskDto(savedTask);
    }

    @Override
    public void deleteTask(Integer userId) {
        taskRepository.deleteById(userId);
    }

    @Override
    public List<TaskDto> findAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(taskConverter::fromTaskToTaskDto)
                .collect(Collectors.toList());
    }

    @Override
    public Task findTaskById(int id) {
        return taskRepository.findById(id);
    }
}

