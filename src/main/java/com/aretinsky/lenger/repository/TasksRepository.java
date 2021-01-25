package com.aretinsky.lenger.repository;

import com.aretinsky.lenger.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TasksRepository extends JpaRepository<Tasks, Integer> {

    Tasks findById(int id);
}

