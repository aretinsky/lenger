package com.java1995.spring_crud.repository;

import com.java1995.spring_crud.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByLogin(String login);
}
