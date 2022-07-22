package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {

    List<Certificate> findAllByDieticianId(Long dieticianId);

    List<Certificate> findAllByCompanyId(Long companyId);
}
