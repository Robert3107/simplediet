package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Company;
import com.simplediet.app.model.entity.MetricBody;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
