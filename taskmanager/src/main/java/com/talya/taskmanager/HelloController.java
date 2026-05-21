package com.talya.taskmanager;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    private final TaskService taskService;

    public HelloController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String hello() {
        return "Task Manager API is running!";
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted!";
    }
}
