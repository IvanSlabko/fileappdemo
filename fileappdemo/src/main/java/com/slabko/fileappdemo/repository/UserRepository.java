package com.slabko.fileappdemo.repository;

import com.slabko.fileappdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String name);
}
