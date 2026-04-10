package com.piyush.taskmanager.service;

import com.piyush.taskmanager.model.Task;
import com.piyush.taskmanager.repository.TaskRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;
    public List<Task> getTasks(){
        return taskRepo.findAll();
    }

    public Task getTaskById(int id) {
        return taskRepo.findById(id).get();
    }
    public String createTask(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new RuntimeException("Title cannot be empty");
        }
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        task.setCreatedAt(LocalDateTime.now());

        taskRepo.save(task);
        return "Saved!";
    }

    public Task updateTask(int id) {
        Task task = taskRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setCompleted(!task.isCompleted());
        return taskRepo.save(task);
    }

    public void deleteTask(int id) {
        if (!taskRepo.existsById(id)) {
            throw new RuntimeException("Task not found");
        }
        taskRepo.deleteById(id);
    }
}
