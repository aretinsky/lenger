package org.aretinsky.lenger.controller.user;

import org.aretinsky.lenger.service.interfaces.TaskService;
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
        model.addAttribute("taskList", taskService.findAll());
        return "homepage";
    }

    @GetMapping("/task/{id}")
    public String taskPage(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("task", taskService.findById(id));
        return "task";
    }
}
