package com.example.pagetracker.model;
import org.springframework.stereotype.Component;

@Component
public class PageCount {
    private Integer count = 0; // Variable to store the visitor count
    // Lombok-generated getter
    public Integer getCount() {
        return this.count;
    }

    /**
     * Increments the visitor count by 1.
     */
    public void increment() {
        count++;
    }
}