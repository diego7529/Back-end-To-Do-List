package com.ToDoList.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ToDoList.model.Task;


public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByUserId(Long userId);
}
