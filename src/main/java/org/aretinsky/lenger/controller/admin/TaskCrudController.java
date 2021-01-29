package org.aretinsky.lenger.controller.admin;

import org.aretinsky.lenger.service.interfaces.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class TaskCrudController {

    private final TaskService taskService;

    @GetMapping("/admin/task/add")
    public String addTaskPage(Model model) {
        model.addAttribute("taskList", taskService.findAll());
        return "homepage";
    }
}
