package org.aretinsky.lenger.controller.user;

import org.aretinsky.lenger.service.interfaces.TaskService;
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
        model.addAttribute("taskList", taskService.findAll());
        return "greeting";
    }
}
