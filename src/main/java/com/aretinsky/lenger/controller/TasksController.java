package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.exception.ValidationException;
import com.aretinsky.lenger.service.TasksService;
import com.aretinsky.lenger.dto.TasksDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TasksController {

    private final TasksService tasksService;

    @GetMapping("/{id}")
    public String taskPage(Model model) {

        return "task";
    }

    //Crud operations

    @PostMapping("/save")
    public TasksDto saveTask(@RequestBody TasksDto tasksDto) throws ValidationException {
        return tasksService.saveTask(tasksDto);
    }

    @GetMapping("/findAll")
    public List<TasksDto> findAllTasks(Model model) {
        return tasksService.findAllTasks();
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Integer id) {
        tasksService.deleteTask(id);
        return ResponseEntity.ok().build();
    }
}
