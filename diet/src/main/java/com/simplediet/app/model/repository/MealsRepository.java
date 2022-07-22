package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Meals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsRepository extends JpaRepository<Meals, Long> {

}
