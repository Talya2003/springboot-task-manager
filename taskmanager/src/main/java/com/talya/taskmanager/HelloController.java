package com.talya.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Task Manager API is running!";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {

        Task task1 = new Task(1L, "Learn Spring Boot");
        Task task2 = new Task(2L, "Build REST API");

        return List.of(task1, task2);
    }
}
