package com.example.pagetracker.controller;

import com.example.pagetracker.model.PageCount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageCountController {

    private final PageCount pageCount;

    public PageCountController(PageCount pageCount) {
        this.pageCount = pageCount;
    }

    @GetMapping("/currentcount")
    public Integer getCurrentCount() {
        return pageCount.getCount(); // Use getCount() method
    }
}