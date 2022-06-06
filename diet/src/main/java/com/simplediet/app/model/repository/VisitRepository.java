package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
