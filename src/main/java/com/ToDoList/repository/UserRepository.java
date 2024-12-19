package com.ToDoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ToDoList.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
}
