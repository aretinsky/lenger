package com.aretinsky.lenger.repository;

import com.aretinsky.lenger.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Integer> {

    Task findById(int id);
}

