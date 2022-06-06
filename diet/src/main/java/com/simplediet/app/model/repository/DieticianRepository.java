package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Diet;
import com.simplediet.app.model.entity.Dietician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DieticianRepository extends JpaRepository<Dietician, Long> {
}
