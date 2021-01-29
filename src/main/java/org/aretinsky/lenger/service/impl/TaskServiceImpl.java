package org.aretinsky.lenger.service.impl;

import org.aretinsky.lenger.exception.ValidationException;
import org.aretinsky.lenger.dto.user.TaskDto;
import org.aretinsky.lenger.entity.user.Task;
import org.aretinsky.lenger.repository.user.TaskRepository;
import org.aretinsky.lenger.service.converters.TaskConverter;
import org.aretinsky.lenger.service.api.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final TaskConverter taskConverter;

    @Override
    public TaskDto save(TaskDto taskDto) throws ValidationException {
        Task savedTask = taskRepository.save(taskConverter.toTask(taskDto));
        return taskConverter.toDto(savedTask);
    }

    @Override
    public void deleteById(Integer taskId) {
        taskRepository.deleteById(taskId);
    }

    @Override
    public List<TaskDto> findAll() {
        return taskRepository.findAll()
                .stream()
                .map(taskConverter::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Task findById(int id) {
        return taskRepository.findById(id);
    }
}

