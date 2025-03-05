package com.example.pagetracker.config;

import com.example.pagetracker.model.PageCount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCountConfig {

    @Bean
    public PageCount pageCount() {
        return new PageCount();
    }
}