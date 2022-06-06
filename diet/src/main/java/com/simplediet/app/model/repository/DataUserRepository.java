package com.simplediet.app.model.repository;

import com.simplediet.app.model.entity.DataUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataUserRepository extends JpaRepository<DataUser, Long> {
}
