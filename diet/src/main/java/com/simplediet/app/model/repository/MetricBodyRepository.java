package com.simplediet.app.model.repository;


import com.simplediet.app.model.entity.MetricBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricBodyRepository extends JpaRepository<MetricBody, Long> {

    MetricBody findMetricBodyByUserId(long id);
}
