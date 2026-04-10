package com.piyush.taskmanager.controller;

import com.piyush.taskmanager.dto.TaskRequest;
import com.piyush.taskmanager.model.Task;
import com.piyush.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "*")
public class TaskController {
    @Autowired
    private TaskService taskService;
    private TaskRequest taskRequest;

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @PostMapping
    public String createTask(@RequestBody TaskRequest taskRequest) {
       return taskService.createTask(taskRequest.getTitle());
    }

    @PatchMapping("/{id}")
    public Task updateTask(@PathVariable int id) {
        return taskService.updateTask(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        taskService.deleteTask(id);
    }
}
