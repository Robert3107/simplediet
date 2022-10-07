package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Dietician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DieticianRepository extends JpaRepository<Dietician, Long> {

}
