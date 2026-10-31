package com.example.taskapi.service;

import com.example.taskapi.model.Task;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    public List<Task> getAllTasks() {
        return List.of(
            new Task(1, "Learn Spring Boot", false),
            new Task(2, "Build controller", true),
            new Task(3, "Push to GitHub", false)
        );
    }
}
