package org.aretinsky.lenger.repository.user;

import org.aretinsky.lenger.entity.user.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findById(int id);
}

