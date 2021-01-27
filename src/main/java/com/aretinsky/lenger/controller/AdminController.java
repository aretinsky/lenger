package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.entity.Task;
import com.aretinsky.lenger.repository.TaskRepository;
import com.aretinsky.lenger.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class AdminController {

    private final TaskService taskService;

    @PostMapping("/admin/task/saveTask")
    public String taskForm(Model model) {
        model.addAttribute("task", new Task());
        return "addTask";
    }

    @GetMapping("/admin/task/add")
    public String addTaskPage(Model model) {
        model.addAttribute("taskList", taskService.findAllTasks());
        return "homepage";
    }
}
