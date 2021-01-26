package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TasksController {

    private final TasksService tasksService;

    @GetMapping("tasks/{id}")
    public String taskPage(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("task", tasksService.findTaskById(id));
        return "task";
    }
}
