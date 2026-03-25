package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.taskmanager.model.Status;
import com.example.taskmanager.model.Priority;
import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
	// Filter by status
    List<Task> findByStatus(Status status);

    // Filter by priority
    List<Task> findByPriority(Priority priority);
}