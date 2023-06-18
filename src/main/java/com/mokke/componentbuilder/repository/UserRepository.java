package com.mokke.componentbuilder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mokke.componentbuilder.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
