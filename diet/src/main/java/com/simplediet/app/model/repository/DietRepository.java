package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Diet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietRepository extends JpaRepository<Diet, Long> {
}
