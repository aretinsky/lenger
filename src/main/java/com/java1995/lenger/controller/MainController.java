package com.java1995.lenger.controller;

import com.java1995.lenger.service.TasksService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class MainController {

    TasksService tasksService;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("tasks", tasksService.findAllTasks());
        return "index";
    }
}
