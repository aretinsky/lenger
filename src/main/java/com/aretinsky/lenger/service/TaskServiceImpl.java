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
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskConverter taskConverter;

    @Override
    public TaskDto saveTask(TaskDto taskDto) throws ValidationException {
        Task savedTask = taskRepository.save(taskConverter.fromTaskDtoToTask(taskDto));
        return taskConverter.fromTaskToTaskDto(savedTask);
    }

    @Override
    public void deleteTask(Integer taskId) {
        taskRepository.deleteById(taskId);
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

