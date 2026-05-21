package com.talya.taskmanager;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public TaskService() {
        tasks.add(new Task(1L, "Learn Spring Boot"));
        tasks.add(new Task(2L, "Build REST API"));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task createTask(Task task) {
        tasks.add(task);
        return task;
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
