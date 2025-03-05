package com.example.pagetracker.controller;

import com.example.pagetracker.model.PageCount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private final PageCount pageCount;

    public WelcomeController(PageCount pageCount) {
        this.pageCount = pageCount;
    }

    @GetMapping("/")
    public String welcome(Model model) {
        pageCount.increment(); // Increment the visitor count
        model.addAttribute("visitorCount", pageCount.getCount()); // Add count to the model
        return "welcome"; // Return the Thymeleaf template name
    }
}