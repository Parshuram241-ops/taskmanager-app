package com.example.taskmanager.service;

import com.example.taskmanager.model.Priority;
import com.example.taskmanager.model.Status;
import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    // CREATE
    public Task createTask(Task task) {
        return repo.save(task);
    }

    // READ ALL
    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    // READ BY ID
    public Task getTaskById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // UPDATE
    public Task updateTask(Long id, Task updatedTask) {
        Task task = repo.findById(id).orElse(null);

        if (task != null) {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setStatus(updatedTask.getStatus());

            // ✅ NEW FIELDS ADDED
            task.setPriority(updatedTask.getPriority());
            task.setDueDate(updatedTask.getDueDate());

            return repo.save(task);
        }
        return null;
    }
     
    // DELETE
    public void deleteTask(Long id) {
        repo.deleteById(id);
    }

	public List<Task> getTasksByPriority(Priority priority) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Task> getTasksByStatus(Status status) {
		// TODO Auto-generated method stub
		return null;
	}
}