package com.talya.taskmanager;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<Task> tasks = new ArrayList<>();

    public HelloController() {
        tasks.add(new Task(1L, "Learn Spring Boot"));
        tasks.add(new Task(2L, "Build REST API"));
    }

    @GetMapping("/")
    public String hello() {
        return "Task Manager API is running!";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return tasks;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {

        tasks.add(task);

        return task;
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable Long id) {

        tasks.removeIf(task -> task.getId().equals(id));

        return "Task deleted!";
    }
}
