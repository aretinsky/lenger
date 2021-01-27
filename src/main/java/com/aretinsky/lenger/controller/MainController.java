package com.aretinsky.lenger.controller;

import com.aretinsky.lenger.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class MainController {

    private final TaskService taskService;

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("taskList", taskService.findAllTasks());
        return "greeting";
    }
}
