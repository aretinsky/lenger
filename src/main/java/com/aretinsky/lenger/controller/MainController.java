package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class MainController {

    TasksService tasksService;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("tasks", tasksService.findAllTasks());
        return "main";
    }
}
