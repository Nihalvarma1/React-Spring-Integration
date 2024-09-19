package com.example.backend_frontend.repository;

import com.example.backend_frontend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
