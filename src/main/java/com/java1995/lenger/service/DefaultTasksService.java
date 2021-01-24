package com.java1995.lenger.service;

import com.java1995.lenger.dto.TasksDto;
import com.java1995.lenger.entity.Tasks;
import com.java1995.lenger.exception.ValidationException;
import com.java1995.lenger.repository.TasksRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@AllArgsConstructor
@Service
public class DefaultTasksService implements TasksService {
    private final TasksRepository tasksRepository;
    private final TasksConverter tasksConverter;

    private void validateUserDto(TasksDto tasksDto) throws ValidationException {
        if (isNull(tasksDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(tasksDto.getSolution()) || tasksDto.getSolution().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }

    @Override
    public TasksDto saveTask(TasksDto tasksDto) throws ValidationException {
        validateUserDto(tasksDto);
        Tasks savedTask = tasksRepository.save(tasksConverter.fromTaskDtoToTask(tasksDto));
        return tasksConverter.fromTaskToTaskDto(savedTask);
    }

    @Override
    public void deleteTask(Integer userId) {
        tasksRepository.deleteById(userId);
    }

    @Override
    public List<TasksDto> findAllTasks() {
        return tasksRepository.findAll()
                .stream()
                .map(tasksConverter::fromTaskToTaskDto)
                .collect(Collectors.toList());
    }
}

