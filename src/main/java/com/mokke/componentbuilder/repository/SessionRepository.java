package com.mokke.componentbuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mokke.componentbuilder.model.Session;
import com.mokke.componentbuilder.model.User;

public interface SessionRepository extends JpaRepository<Session, String> {
    public List<Session> findByUser(User userid);
    void deleteById(String id);
}
