package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("taskList", taskService.findAllTasks());
        return "homepage";
    }

    @GetMapping("/task/{id}")
    public String taskPage(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("task", taskService.findTaskById(id));
        return "task";
    }
}
