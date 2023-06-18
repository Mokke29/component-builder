package com.mokke.componentbuilder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mokke.componentbuilder.model.ContextHistory;
import com.mokke.componentbuilder.model.Session;

public interface ContextHistoryRepository extends JpaRepository<ContextHistory, Long>{

    public List<ContextHistory> findBySessionid(Session session);
}
