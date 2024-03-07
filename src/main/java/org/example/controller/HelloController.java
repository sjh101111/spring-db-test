package org.example.controller;

import org.example.repository.StudentJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private StudentJdbcRepository studentJdbcRepository;
    @GetMapping("/hello")
    public int hi() {
        return studentJdbcRepository.countOfStudent();
    }
}
