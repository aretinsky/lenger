package com.java1995.lenger.repository;

import com.java1995.lenger.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TasksRepository extends JpaRepository<Tasks, Integer> {

    Tasks findById(int id);
}

