package com.example.datax.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.datax.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed
}