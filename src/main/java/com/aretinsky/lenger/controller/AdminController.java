package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TasksService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class AdminController {

    private TasksService tasksService;

    @PostMapping("/tasks/add")
    public String addTask(Model model) {
       // model.addAttribute("task", "");
        return "addTask";
    }
}
