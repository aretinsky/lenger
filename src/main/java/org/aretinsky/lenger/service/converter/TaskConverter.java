package org.aretinsky.lenger.service.converter;


import org.aretinsky.lenger.dto.user.TaskDto;
import org.aretinsky.lenger.entity.user.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public Task toTask(TaskDto taskDto) {
        return Task.builder()
                .id(taskDto.getId())
                .title(taskDto.getTitle())
                .author(taskDto.getAuthor())
                .github_description(taskDto.getGithub_description())
                .github_solution(taskDto.getGithub_solution())
                .success_count(taskDto.getSuccess_count())
                .attempts_count(taskDto.getAttempts_count())
                .difficult_level(taskDto.getDifficult_level())
                .build();
    }

    public TaskDto toDto(Task task) {
        return TaskDto.builder()
                .id(task.getId())
                .title(task.getTitle())
                .author(task.getAuthor())
                .github_description(task.getGithub_description())
                .github_solution(task.getGithub_solution())
                .success_count(task.getSuccess_count())
                .attempts_count(task.getAttempts_count())
                .difficult_level(task.getDifficult_level())
                .build();
    }
}
